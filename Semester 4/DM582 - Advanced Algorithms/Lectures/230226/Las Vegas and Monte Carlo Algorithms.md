---
updated_at: 2026-02-23T11:44:09.726+01:00
edited_seconds: 330
---
## Las Vegas
A las vegas algorithm is an algorithm where one is certain that completeness will be found. 
Sacrifices waiting time to ensure this.
### Example
Guaranteed $\frac{7}{8}k$ clauses satisfied.
$P_j$ is the probability that a uniformly random assignment satisfies $j$ clauses.
Expected satisfied: $\sum^k_{j=1} j \times P_j = \frac{7}{8}k$ ([[Max 3 Satisfiability (abbr. MAX 3-SAT)|Found Here]])
$$\sum_{j < \frac{7}{8}k} j \times P_j + \sum_{j \geq \frac{7}{8}k} j\times P_j$$

<hr>
## Monte Carlo
Opposite of [[Las Vegas and Monte Carlo Algorithms#Las Vegas|Las Vegas]]. Quicker but not guaranteed.


