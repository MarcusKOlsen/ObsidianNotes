---
updated_at: 2026-04-20T10:46:49.803+02:00
edited_seconds: 900
---
## Definition
Running a selection in $O(n)$ deterministically (as opposed to expected $O(n)$ with worst case $O(n^2)$)

## Method
$SELECT(A,p,r,i), i <= i <= n$, 
$A$ being array
$p$ being some spot
$r$ being another spot
$i$ being the value we want, the $i$th smallest element

divide into 5 partitions, $g = \frac{n}{5}$
sort all groups of 5, $$A[p+2], \space A[p+g+2], \space A[p+2g+2], \space A[p+3g+2], \space A[p+4g+2]$$
recursively call on that
$x = SELECT(A,p+2g, p+3g-1, \lceil \frac{g}{2} \rceil$)
$q = PARTITION-AROUND(A,p,r,x)$

this finds a position $q$, with value $x$ in it.
$k = q-p+1$, meaning all the values from $p$ to $q$
now, if $i = k$, the answer is $x$

if $i < k$, then $SELECT(A,p,q-1,i)$
if $i > k$, then $SELECT(A,q + 1, r, i-k)$

## Complexity
Sorting on $\frac{n}{5}$ takes $O(n)$, no surprise there
Then, the recursive call $SELECT$ takes $T(\frac{1}{5})$ time, makes sense
$PARTITION-AROUND$ takes $O(n)$ time

The $k$ check is at most $T(\frac{7n}{10})$

$$T(n) \leq T(\frac{n}{5}) + T(\frac{7n}{10}) + O(n))$$
There must exist some constant $c$, so that:
$$T(1) = c_1 \times 1$$
$$\ldots$$
$$T(4) = c_4 \times 4$$
$$n \leq 4 : \space T(n) \leq c \times n$$
$$n \geq 5 : \space T(\frac{n}{5}) \leq c \times \frac{n}{5}, \space T(\frac{7n}{10}) \leq c \times \frac{7n}{10}$$

$$T(n) \leq c \times \frac{n}{5} + c \times \frac{7n}{10} + c^* \times n$$
$$\leq c \times \frac{9n}{10} + c \times \frac{1}{10} \times n = c \times n$$
