---
updated_at: 2025-03-18T09:17:01.209+01:00
edited_seconds: 170
---
## Example
![[Pasted image 20250318091221.png]]
### Visualisation
![[Pasted image 20250318091235.png]]

## Elaboration
With this increased information you can now find:
![[Pasted image 20250318091300.png]]
In O(logn) time. <span class="green">Very efficient</span>

### Pseudocode
![[Pasted image 20250318091346.png]]


### Finding value of the parent
#### Elaboration
![[Pasted image 20250318091512.png]]
![[Pasted image 20250318091518.png]]
<center class="green"> With this assumption, we can now calculate the value of a parent node in O(1) time</center>
##### Visualisation
![[Pasted image 20250318091528.png]]

### More possibilities with this extra information
![[Pasted image 20250318091642.png]]
![[Pasted image 20250318091648.png]]
<center class="green"> Finding the sum, max and min is now possible, along with finding the average for a specific area (the sum divided by the amount of nodes) </center>
