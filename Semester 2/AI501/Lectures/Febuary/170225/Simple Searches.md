---
updated_at: 2025-02-17T10:40:06.085+01:00
edited_seconds: 580
---
## Problem Types
![[Pasted image 20250217102443.png]]

## Search Types
### Breadth-first searches
![[Pasted image 20250217102552.png]]
<center> Searches the shallowest unexpanded nodes first. FIFO </center>

#### Properties
- <span class="green">Complete (will always find the goal)</span>
- <span class="red">Exponential time cost, depending on the depth of the tree </span>
- <span class="red">Keeps every node in memory</span>
### Depth-first search
![[Pasted image 20250217102627.png]]
<center> Searches the deepest unexpanded node first. LIFO</center>

#### Properties
- <span class="red"> Incomplete, fails in loops and infinite trees </span>, <span class="green"> Can be modified to work</span>
- <span class="red"> Very slow if the goal is later in the search queue, for example on the right side </span>
- <span class="yellow">Takes up the space of the maximal depth in the tree</span>
- <span class="red"> Not optimal </span>
### Greedy Search
![[Pasted image 20250217102706.png]]
<center> Greedily searches the cheapest node, in terms of a figurative cost </center>

#### Properties
- <span class="red"> Not complete, can get stuck in loops </span>
- <span class="yellow"> Similar search time to depth search, but can be improved strongly with a good heuristic</span>
- <span class="yellow"> Similar storage space to depth-first search </span>
- <span class="red"> Not optimal </span>
### A* search
![[Pasted image 20250217102750.png]]
<center> Avoids the nodes that cost the most, and searches down the tree to minimise cost </center>
#### Properties
- <span class="green"> Complete </span>
- <span class="yellow"> Exponential time equaling to (relative error) * length of solution</span>
- <span class="red"> Keeps all nodes in memory </span>
- <span class="Green"> Optimal, meaning it always chooses the most optimal path </span>


