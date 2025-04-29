---
updated_at: 2025-03-27T10:21:39.770+01:00
edited_seconds: 180
---
## Definition
The base idea of divide-and-conquer algorithms are as follows:
1. Split the problem into smaller parts of the problem (*of the same type*)
2. Sove these parts with [[Recursive algorithms|recursion]] (*calling the algorithm on itself, with decreasing inputs*)
3. Construct a solution to the problem out of the solutions to the parts

## Visualisation
![[Pasted image 20250327102001.png]]
<center> The splitting up and recursive calls of the algorithm </center>

This divide-and-conquer structure can be visualised through recursion trees.
## Examples
### Mergesort
![[Pasted image 20250327101926.png]]

### Quicksort
![[Pasted image 20250327101936.png]]