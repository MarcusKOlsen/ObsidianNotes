---
updated_at: 2025-03-11T09:02:35.314+01:00
edited_seconds: 270
---
## Definition
A dictionary is a [[Semester 1/(DM549, DS820)/Lectures/September/250924/Datastrukturer|Datastruktur]] with the following operations:
![[Pasted image 20250311085757.png]]
<center> The last three operations require ordered keys</center> 

If only the first three are applicable, then the dictionary is defined as an **Unordered Dictionary**.
If all six are applicable, the dictionary is defined as an **Ordered Dictionary**.

### Implementations of dictionaries

![[Pasted image 20250311085956.png]]
#### Elaboration
![[Pasted image 20250311090033.png]]
- [[Binary Searching Trees]]

These two ways of implementing dictionaries are supported in Java as ***TreeMap*** and **HashMap***.
In python the built-in *dict* type utilizes hashing. No balanced binary trees exist natively in python, but they can be imported with the use of libraries.
