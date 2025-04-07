---
updated_at: 2025-03-11T08:30:03.042+01:00
edited_seconds: 400
---
## Definition
Prioritetskører bruger, ligesom [[Semester 2/Algoritmer & Datastrukturer/Lectures/March/110325/Datastrukturer|Datastrukturer]], noget data og nogle operationer.

### Data
- **Element: Nøgle (ID)** fra et ordnet univers samt evt. yderligere data.

> [!Example] # [[Implementations of priority queues|Implementations of priority queues in heapsort]]
> 


## Operations
### Central Operations
![[Pasted image 20250311082027.png]]

#### Elaboration
- **EXTRACT-MAX**
	- Returns the element with the largest key(ID) in the queue Q. Removes the element afterwards.
- **INSERT**
	- Insert an element into the queue Q.

### Extra Operations
![[Pasted image 20250311082129.png]]
#### Elaboration
- **INCREASE-KEY**
	- Changes the referenced key into the largest ID number of the old and new key. 
		- Essentially if you give a key that is smaller, it won't affect the queue.
- **BUILD**
	- Builds a queue with the elements of the list L.
##### Trivial operations
![[Pasted image 20250311082140.png]]



