---
updated_at: 2025-02-21T10:29:30.228+01:00
edited_seconds: 210
---
![[Pasted image 20250221101906.png]]

## A)

- State Space
	- Alle mulige kombinationer af de tre kannibaler og missionaries i de forskellige positioner, samt positionen af båden
- Initial State 
	- Tre kannibaler og tre missionærer på samme side
- Goal State
	- Alle kannibaler og missionærer på den anden side
- Actions
	- Tag båden (et eller to mennesker)
- Transition Model
	- De tager båden og ender på den anden side
- Action Cost Function
	- Meget dyrt at have flere kannibaler end missionaries på et spot
	- Cost på at bruge båden