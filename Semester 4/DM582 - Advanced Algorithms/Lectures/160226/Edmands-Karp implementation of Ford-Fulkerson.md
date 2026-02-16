---
updated_at: 2026-02-16T10:26:00.727+01:00
edited_seconds: 210
---
Extension of [[Maximum Flow#Methods of solving|Ford-Fulkerson]]

## Flow
Start by taking shortest path from $s$ to $t$ (unweighted graph).
$\delta_f(u,v)$ : Shortest path
$$\forall v \in V, \{s,t\}: \delta (s,v)$$
^ grows monotonally (never decreases) for each [[Maximum Flow#Augmentation|Augmentation]]

