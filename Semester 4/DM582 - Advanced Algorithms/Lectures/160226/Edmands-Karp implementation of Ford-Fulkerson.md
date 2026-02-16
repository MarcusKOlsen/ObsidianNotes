---
updated_at: 2026-02-16T10:45:49.363+01:00
edited_seconds: 340
---
Extension of [[Maximum Flow#Methods of solving|Ford-Fulkerson]]

## Flow
Start by taking shortest path from $s$ to $t$ (unweighted graph).
$\delta_f(u,v)$ : Shortest path
$$\forall v \in V, \{s,t\}: \delta (s,v)$$
^ grows monotonally (never decreases) for each [[Maximum Flow#Augmentation|augmentation]]

## Termination
Edmands-Karp terminates after $O(V \times E)$ [[Maximum Flow#Augmentation|augmentations]]. 
Unlike [[Maximum Flow#Methods of solving|Ford-Folkerson]], the Edmands-Karp implementation does NOT slow down with higher flow values.


