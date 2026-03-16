---
updated_at: 2026-03-09T12:14:04.755+01:00
edited_seconds: 1610
---
[[CLRS.pdf|CLRS]] Chapter 16

## Definition
Analysis understanding that an operation is not always equally expensive to run (f.eks if priority queues are implemented). Imagine only a few sequences are expensive, and the rest are easy. $O(n)$ is not always indicative of this.

## Aggregate Method
### Example
A month of studying (in hours):
$w_1 = 10, w_2 = 10, w_3 = 60$

**Amortized** $w = avg(w_1, w_2, w_3)$ 
**Amortized Upper Bound** $|w| * avg(w_1, w_2, w_3)$

Yet, all prefixes of $w$ should hold. Therefore $w_2 + w_3$ work is not equal to $2 * avg(w_1, w_2, w_3)$

## Potential Function
Defining a function that behaves in a way appropriate to the datastructure.

### Usage
Some data $D_0$ and some operation $op$, turns $D_0 \rightarrow D_1$, until $D_n$
There's some cost for each: $c_1, c_2, c_n$

Define some potential function $\phi$.
Now we need the amortized cost $\hat{c_i} = c_i +\triangle \phi$
$\triangle \phi = \phi(D_i) - \phi(D_{i-1})$
This formula simplifies to: potential at the end minus potential at the beginning.

A good starting point that is usually used is ensuring $\phi(D_0) = 0$, and $\phi(D_i) \geq 0$
Meaning stuff gets 'saved up', and it starts without having anything saved up.

### Defining a potential function
#### [[Amortized Analysis#Stack datastructure|Stack]] example
$\phi :$ num. of elements on the stack

Start with an empty stack: $\phi(D_0) = 0$
Since we're counting a number of things that cannot be negative, $D(D_i) \geq 0$.
These two things fulfill the [[Amortized Analysis#Usage|requirements]].

Assuming *push* and *pop* take equal time to run, a *push* can be considered as a future saving up for a *pop*. $c$ is defined as a unit of time.

| op          | c   | $\triangle \phi$ | $\hat{c}$ |
| ----------- | --- | ---------------- | :-------: |
| push        | 1   | 1                |     2     |
| pop         | 1   | -1               |     0     |
| multipop(k) | k   | -k               |     0     |

Observing the table, $n$ operations takes $\leq 2n$ time units: $\theta(n)$

#### [[Amortized Analysis#Binary Counter|Binary Counter]] example
$\phi :$ num of 1's in the counter

Checking again:
$\phi(D_0) = 0$, since my binary counter starts with all 0's in the int.
$\phi(D_i) \geq 0$, since the binary value cannot use -1 bits. They don't exist

$t$ denotes the num. of consecutive 1's coming from the right

| op  | c     | $\triangle \phi$ | $\hat{c}$ |
| --- | ----- | ---------------- | --------- |
| inc | $t+1$ | $-t+1$           | 2         |
| inc | ...   | ...              | 2         |
$n$ increments $\leq 2n$ time, $\theta(n)$

### Example of issues
#### Stack datastructure
Introducing a new function outside of push, pop and init:

```
multipop(S,k)
	while not empty(S) && k > 0:
		pop(S)
		k--
```

flow: `init, push, pop, push, multipop, push`. Multipop has variable time, but is $O(n)$
Meaning, for $n$ operations, the upper bound is $n \times O(n)$, which makes the upper bound $\theta(n²)$

#### Binary Counter
In a binary counter, the worst case is a number full of 1s. In that case, an increment would have to run through and change every bit, but it's not guaranteed to do so. Therefore, the best upper bound would have to be $\theta(n\times logn)$
