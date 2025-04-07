---
updated_at: 2025-02-18T12:45:46.645+01:00
edited_seconds: 280
---
## IN
### Definition
The **IN** operator returns true if and only if a some tuple is part of the relation that is being queried.
![[Pasted image 20250218122612.png]]
### Example
![[Pasted image 20250218122627.png]]
### Elaboration
![[Pasted image 20250218122710.png]]

## EXISTS
### Definition
The **EXISTS** operator returns true if and only if the subquery result has values, and isn't empty.
![[Pasted image 20250218122723.png]]
### Example
![[Pasted image 20250218122732.png]]

## ALL
### Definition
**ALL** is used mainly for checking whether or not some value (in this case, X) is unique and not a part of the relation that the subquery returns.
![[Pasted image 20250218122758.png]]
### Example
![[Pasted image 20250218122806.png]]

## ANY
### Definition
**ANY** is mainly used to find out if a tuple (in this case, x), is equal to any tuples in the relation from the subquery.
![[Pasted image 20250218122746.png]]
