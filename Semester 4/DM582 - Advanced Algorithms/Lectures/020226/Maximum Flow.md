---
updated_at: 2026-02-02T11:20:16.942+01:00
edited_seconds: 750
---
![[Pasted image 20260202103317.png]]
## Goal
Find maximum flow, by figuring out an efficient flow function and algorithm.
> [!RULES]
> Directed $G = (V,E)$
> $V(u,v) \in E$ has *capacity* $c(u,v) \geq 0$
> $V(u,v) \in E \rightarrow (v,u) \notin E$
> $V(u,v) \in E \rightarrow u \neq v$ (cannot point to itself)
> $c_f(u,v) = c(u,v) - f(u,v)$ (denotes remaining capacity in network after flow)


## Flow
Flow is a function, i.e $f: VxV \rightarrow \mathbb{R}$
$0 \leq f(u,v) \leq c(u,v)$
**Value**
The value of the flow is, in essence, a calculation of how much is leaving a node compared to coming in

## Residual network
Whatever resides after flow, which remains in capacity of edge. Whatever gets sent forward gets 'flipped' in RN, because it can in principle be sent back.

## Augmentation
$f(u,v) + f_{prime}(u,v) - f_{prime}(v,u)$, where $f_{prime}$ is an augmented flow

## Methods of solving

> [!NOTE] Ford-Fulkerson method
> Start off by setting the flow f to zero for all nodes
> Augment path p in residual network while an augmentable path exists.
>
> ![[Pasted image 20260202111922.png]]


 Gf (RESIDUAL NETWORK)
> Flow ..., exact antiparallel edges are allowed, meaning something can flow both ways if they equal out.
