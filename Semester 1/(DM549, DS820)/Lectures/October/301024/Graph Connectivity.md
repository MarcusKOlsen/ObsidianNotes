## Definition
Graph connectivity is a way of formalising beregningsproblemer.

In graph connectivity, one needs to go from a point $s$ to a point $t$, and the way to do this is to create a list of demands for the graph, and see if any points are applicable. Any languages where a formed string can go from $s$ to $t$, is defined as the language GraphConnectivity
![[Pasted image 20241030082755.png]]

## Example
![[Pasted image 20241030082822.png]]
This is an example of a graph where one could apply graph connectivity. This graph is a visual representation of a theoretical set of data. Not all edges connect, and some points are just straight up useless. Graph Connectivity is the language of creating a path from $s$ to $t$ in these nodes, using the edges
## Terminology
![[Pasted image 20241030082952.png]]![[Pasted image 20241030083050.png]]
The way to represent a well formed string from graph connectivity is to first define the amount of points in the graph ($n$). Afterwards you define which points you need to travel from, and travel to ($s$ and $t$). Then you define all the edges that travel from one point to another ($u_m, v_m$), with $m$ being the max number of edges that exists in the graph.

---

> [!Warning]
> <center>Details of the formatting will not always be the same.</center>
> <center>The names of the different letters can be different</center>

## Calculating the shortest path

If you want to calculate the shortest path of a graph connectivity problem, you can add an unknown $k, k = \mathbb{N}$. This k is defined as the max amount of edges ($u,v$) that should exists between $s$ and $t$. If you can find a path from $s$ to $t$ that is of $k$ length edges (or lesser), it will return a proper path. 

---

> [!Tip] Binary Search
> If you collect all these paths and do a binary search on it, you can determine the very fastest path. This takes a while, but will return the most optimal pathing.
> Optionally you can also use binary search to find the path itself, and just keep making $k$ smaller until you find the smallest possible $k$ for the graph.


## Sorting seen as a language
### Definition
![[Pasted image 20241030085916.png]]




> [!Definition] [[Solving Beregningsproblemer]]


