---
updated_at: 2026-02-23T11:28:04.089+01:00
edited_seconds: 510
---
## Terminology
Formulas: $\space c_1: (q \lor q_2, \lor \overline{q_4})\land c_2:(q_3 \lor \overline{q_2} \lor \overline{q_7}) \ldots \land c_k$
<center> Max 3 constants per statement </center>
### Usage
Assign $q_i$ with true/false with random prob. $\frac{1}{2}$. $C_i$ fails w prob $n\times\frac{1}{2}$, for $n$ chances.
$Z_i = 1$ if $C_i$ else $0$
$$E[\sum^K_{i=1}Z_i] = \sum^K_{i=1}E[Z_i]$$
With chance being $\frac{7}{8}$ & $\frac{k-1}{k} < \frac{7}{8}$, we can do better. $8k - 8 < 7k = k < 8$. If $k < 8$, then there will be an [[Max 3 Satisfiability (abbr. MAX 3-SAT)#Terminology|assignment]] that fulfills all clauses at the same time.

