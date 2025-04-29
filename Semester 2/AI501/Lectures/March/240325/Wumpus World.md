---
updated_at: 2025-03-24T10:30:37.891+01:00
edited_seconds: 230
---
## Definition


> [!Definition] 
> The wumpus world is a cave consisting of rooms connected by passageways. Lurking somewhere in the cave is the ** W U M P U S**, a terrible beast who eats anyone that enters its room.
> Some rooms contain bottomless pits that will trap anyone except wumpus
> The only redeeming feature of the wumpus world is a possibility of finding gold.

- **Environment**
	- Squares adjacent to wumpus are smelly
	- Squares adjacent to a pit are breezy
- **Actuators**
	- Left Turn
	- RIght Turn
	- Forward
- **Sensors**
	- Feel breeze
	- Smell

## Using [[Simple Searches|Depth-first]] inference to find the sound and complete path
![[Pasted image 20250324103035.png]]
<center> This runs at a time of O(2^n) </center>
