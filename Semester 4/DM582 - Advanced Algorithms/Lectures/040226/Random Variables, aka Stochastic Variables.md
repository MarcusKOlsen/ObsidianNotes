---
updated_at: 2026-02-04T09:44:59.996+01:00
edited_seconds: 790
---
$X : S \rightarrow \mathbb{R}$, a function from the sample space to a real number


> [!NOTE] Expected value
> $E[X]$ **denotation**
> $E[X] = \sum_{s \in S} P(s) \times X(s)$
> $E[X] = \sum_{r \in X(S)} P(X=r) \times r$ **improved notation**
> $E[X+Y] = E[X] + E[Y]$ **ALWAYS HOLDS**
> $E[a \times X] = a \times E[X]$ **ALSO ALWAYS HOLDS**

> [!NOTE] Indicator Random Variable
> $X: S \rightarrow {0,1}$
> $E[X]=P(X=0) \times 0 + P(X=1) \times 1$ = $P(X=1)$

> [!NOTE] Geometric distribution
> $P(X=k)= (1-p)^{k-1} \times p, k \in {1,2,3, \ldots}, 0 \leq p \leq 1$ $| X$ with parameter $p$
> $E[x] = \sum_{j=1}^\infty j \times P(X=j)$
> $= \sum_{j=1}^\infty j \times (1-p)^{j-1} \times P$
> $=P \times \sum_{j=1}^\infty j \times (1-P)^{j-1}\times P$
> $=P \times \frac{1}{P²}=\frac{1}{P}$ 
> 


> [!NOTE] Markov inequality
> $P(X \geq a) \leq \frac{E[X]}{a}$
