---
updated_at: 2026-02-23T10:32:36.061+01:00
edited_seconds: 470
---
## Definition
$(A,B)$ cut: $V = A \cup B, \space A \cap B = Ø, \space A \neq Ø, B \neq Ø$ (with $Ø$ denoting empty)

## Method
A way to calculate a global minimum cut is to convert it to a directed flow graph with 1 capacity, and then picking an $s$ and trying different $t$ values.

## Contraction
![[Pasted image 20260218092836.png]]
On repeated contraction, one ends in a simple 2-vertex graph that has an obvious minimum cut.

### Pseudocode (algorithm)
```
if |v| = 2 # If there are only 2 vertices left
	return (S(v1), S(v2)) # Splitting vertices into two, "cut"
else 
	select e = (u, v) # Uniformly at random (for k edges, probability 1/k)
	G = new Graph(# Graph you get from contracting e into one vertex)
```

### Probability
$prob(GMC) \geq \frac{1}{\binom{n}{2}}$, with $GMC$ being the Global Minimum Cut.
This is the probability that you get a particular $GMC$ from the contraction algorithm

## Number of [[Global Minimum Cut (Undirected Weightless Graph)|Global Minimum Cuts]]
There can always be at most $\binom{n}{2}$ global minimum cuts.