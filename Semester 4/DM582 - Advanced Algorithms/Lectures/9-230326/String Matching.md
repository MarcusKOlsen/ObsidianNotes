---
updated_at: 2026-04-08T08:30:01.904+02:00
edited_seconds: 2640
---
## Terminology
$\sum$ = alphabet. (example: $\sum = 128$ characters in alphabet)

$T$ = text string
$P$ = text pattern to search for

$s$ = shift in text, certain distance from beginning
valid $s$ = a shift made to get a match in the pattern

$\sum^*$ = all strings over $\sum$, includes empty string
$\epsilon$ = empty string

$x \sqsubset y$ = w prefix of x (example: $aa \sqsubset aab$ ) 
$x \sqsupset y$ = w suffix of x (example: $ab \sqsupset aab$)

$xy$ = concatenation

$P[j:k]$ = from $j$ to $k$ (inclusive)
$P[:k] = P[1:k]$
$P[:0] = \epsilon$
$P[4:3] = \epsilon$

## Definition
regex

Finding all different values of $s$ to fit all occurrences of $P$ onto $T$

## Lemma
$$x, y, z \in \sum^*, \space x \sqsupset z, \space y \sqsupset z$$
$$|x| \leq |y| \rightarrow x \sqsupset y$$
## Algorithms
### 1: Naive String-Matcher(T, P, n, m)
$n = |T|, \space m = |P|$

``` 
for s = 0 to n-m:
	if P[1.. m] == T[s+1:+m]: #valid shift
		print(s)
```
<center>O(n)</center>

### 2: Robin-Karp String-Matcher
$\sum = \{a, b, c, d, e, f, g, h, i, j\}$, $\forall_i, {i \in [0.. |\sum|]} \space \sum[i] = i$
$T: c \space c \space a \space d \space b \space e \space b \space f \space c \space b = 2203141521$
$P: d \space b \space e \space b \space f = 31415$

$22031$ (part of $T)
$2$ (first digit) $\rightarrow 2 \times 10^{4 \space \#(m-1)} = 20000$
$22031 - 20000 = 2031$
$2031 \times 10$($|\sum|$) $= 20310$
$20310 + 4$(next digit in T) $= 20314$
$314 \sqsubset P$

$\theta(n) \leq O(n)$

What if $|\sum| \geq 10$ ?
Apply:
#### Heuristic
$t_s$ = number corresponding to $T[s+1:s+m]$
$d = |\sum|$
$t_{s+1} = (t_s - T[s+1] \times d^{m-1}) \times d + T[s+m+1]$ (formal example of the above)

Choose prime $q$ as large as possible so that $q \times d$  fits in a word ($\leq 2^{64}$)
Choosing prime just works better

$$t_{s+1} = ((t_s - T[s+1] \times d^{m-1}) \times d (mod \space q) + T[s+m+1]) \space mod \space q$$ <center>(to make everything a bit smaller in size)</center>
<center> runs risk of false positives </center>
##### Example
$4$ bit words $(2^4)$, $q = 5$, $\sum = \{0, 1\}$, $|\sum| \times q \leq 2^4 -1$

$T: 1001001110$, $P : 010$

returns true on $010$, but also $111$ because of the $mod \space q(5)$. Therefore, a double check on all valid shifts is needed.

$O(n) + O(m \times (v + \frac{n}{q}))$, with $v =$ num of valid matches. 
$\frac{n}{q}$ = estimated num of false positives in a uniformly random $T$


### 3: String-Matching with Finite Automata
#### Finite Automata
##### Terminology
Automata $M = (Q, q_0, A, \sum, \delta)$
$Q$ = finite state
$q_0$ = start state
$A \leq Q$ accepting state
$\sum$ finite alphabet
$\delta$ function that takes a state $Q$ and some symbol from alphabet $\sum$: 
$$\delta : Q \times \sum \rightarrow Q$$
$\varphi$: final state function
$$\varphi: \sum^* \rightarrow Q$$
$\varphi(\epsilon) = q_0$
$\varphi(w \times a) = \delta(\varphi(w), a)$

--- 
It accepts certain strings, and rejects others. For example:
accepting state: $q_1$

| $\delta$ | $a$   | $b$   |
| -------- | ----- | ----- |
| $q_0$    | $q_1$ | $q_0$ |
| $q_1$    | $q_0$ | $q_0$ |

| accept | reject     |
| ------ | ---------- |
| aaa    | aa         |
| a      | $\epsilon$ |
| aba    | aab        |

#### Method
$T$ as always
$P$: build a DFA(Deterministic Finite Automata) from it. 

Preprocessing to setup DFA. Uses $P$
Essentially fits the pattern perfectly, with "shortcuts" if something goes wrong in the pattern you don't have to start from the very back if not necessary
DFA runs on $T$ in $O(n)$ time.

Defines a suffix function:
$\varphi(x) = max \{k \space | \space P[:k] \sqsupset x\}$
$\delta(q,a) = \varphi(P[:q]a)$

#### Example
$P: ababaca$
DFA:

| $\delta$ | a     | b   | c   |
| -------- | ----- | --- | --- |
| 0        | 1     | 0   | 0   |
| 1        | 1     | 2   | 0   |
| 2        | 3     | 0   | 0   |
| 3        | 1     | 4   | 0   |
| 4        | 5     | 0   | 0   |
| 5        | 1     | 4   | 6   |
| 6        | **7** | 0   | 0   |
| **7**    | 1     | 2   | 0   |
[[String Matching cont]]
