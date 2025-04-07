---
updated_at: 2025-04-03T11:00:40.367+02:00
edited_seconds: 190
---
## Definition
Multiplying a matrix classically has a running time of $\theta(n^3)$. Not very good. With a recursive algorithm we can file this down

## Recursive Algorithm

![[Pasted image 20250403105745.png]]
![[Pasted image 20250403105753.png]]
For now, this seems much quicker.
### Using the master theorem
![[Pasted image 20250403105930.png]]
This creates a time of $\theta(n^3)$ :(


## Strassens Algorithm
![[Pasted image 20250403110019.png]]
![[Pasted image 20250403110025.png]]
![[Pasted image 20250403110031.png]]
<span class="green"> IMPROVEMENT </span>
