---
updated_at: 2026-03-16T11:51:55.993+01:00
edited_seconds: 1020
---
### [[Universal Hashing#Terminology|Terminology]]

## Definition
Choosing a hash function that is mathematically perfect without collision
A static $O(n)$, $O(1)$ lookup structure.

### Theorem 11.9 (CLRS)
$n$ keys, table size $m = n²$, [[Universal Hashing#Universal Family|univ. hash h]]
prob. of **any** collisions $\leq \frac{1}{2}$

#### Proof
$k_1 \neq k_2$ collide with prob. $\leq \frac{1}{n²}$
$X =$ #collisions 
$$E[X] =  \binom{n}{2} \times \frac{1}{n^2} = \frac{n \times (n-1)}{2} \times \frac{1}{2} \leq \frac{1}{2}$$ $$Pr\{X \geq 1\} \leq \frac{E[X]}{1} \leq \frac{\frac{1}{2}}{1} = \frac{1}{2}$$
### Algorithm Construction ( [[Perfect Hashing#Definition|Requirements]] )
Done with the use of a [[Las Vegas and Monte Carlo Algorithms#Las Vegas|Las Vegas Algorithm]] (no worst case upper bound on time)

Repeat:
	choose h unit randomly from [[Universal Hashing#Universal Family|univ. family]]
	compute $s = \sum_{j=0}^{m-1} n_j^2$
until $s \leq 4n$
// Expected at most $\frac{1}{\frac{1}{2}} = 2$ trials

// Essentially just trying out universal hashing shit until one fits well

for $j = 0$ to $m-1$:
	repeat: 
	choose $h_j$ unit from [[Universal Hashing#Universal Family|univ. family]]
	hash to table of size $m_j = n_j²$
until no collisions

// Expected at most $\frac{1}{\frac{1}{2}} = 2$ trials
#### Expected construction time
$$2n +\sum_{j=0}^{n-1} 2n_j = 2n + 2n = 4n$$
#### Expected construction space
$$n + 4n = 5n$$
#### Expected lookup time
$$O(1)$$
