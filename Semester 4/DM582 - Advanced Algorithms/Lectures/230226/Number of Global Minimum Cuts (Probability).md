---
updated_at: 2026-02-24T11:41:30.843+01:00
edited_seconds: 1270
---
For $C_1, C_2, C_3, \ldots, C_r$, all [[Global Minimum Cut (Undirected Weightless Graph)|Global Minimum Cuts]] in a any graph $G$, Event $E_i$: find $C_i$,
the probability of finding any of the Global Minimum Cuts is the probability of the union of all:
$$
1 \geq \sum^r_{i=1} Pr[E_i] \geq \sum^r_{i=1} \frac{1}{\binom{n}{2}} = \frac{r}{\binom{n}{2}}
$$

## Waiting time for first success
For a success with probability $P$, $X$ denotes the number of repeats until success.
$E[X] = \frac{1}{P}$

### Example, Guessing Cards
$X$ denotes the number of correct guesses
$X_i = 1$ if card $i$  guessed else $0$.

$$E[X_i] = 0 \times Pr[X_i = 0] + 1 \times Pr[X_i = 1] = Pr[X_i = 1] = \frac{1}{n}$$
$$E[X] = E[\sum^n_{i=1}X_i] = \sum^n_{i=1} E[X_i] = \sum^n_{i=1} \frac{1}{n} = 1$$
#### Incorporating Memory (Choosing What Hasn't been seen yet)
$$E[X_i] = Pr[X_i] = \frac{1}{n - (i-1)}$$
$$E[X] = \sum^n_{i=1} \frac{1}{n-i+1} = \sum^n_{i=1} \frac{1}{i}$$
<center> ^ The harmonic number H(n) which is close to the natural log of n ^</center>


### Collecting $n$ coupons
Probability is equal,
$x_j$ denotes the waiting time from having $j$ coupons to having $j+1$ coupons.
$$Pr[x_j + 1] = \frac{n-j}{n}, E[X_j] = \frac{1}{\frac{n-j}{n}} = \frac{n}{n-j}$$
**Total Waiting Time:**
$$E[\sum^{n-1}_{j=0} X_j] = \sum^{n-1}_{j=0} E[X_j] = \sum^{n-1}_{j=0} \frac{n}{n-j} = n \times \sum^{n-1}_{j=0} \frac{1}{n-j} = n \times \sum^n_{i=1} \frac{1}{i} \in O(n\times log_n)\space aka. \space H(n)$$
<center> Once again, the harmonic number </center>
[[Harmonic Numbers]]
Here, $H(n) = 2.93$ (ish), so the waiting time for $10$ coupons: $H(10) = 29.3$



