---
updated_at: 2025-03-20T10:47:25.921+01:00
edited_seconds: 140
---
## Definition
- **A**
	- *Atomic*
		- Either the entire transaction happens, or nothing happens
- **C**
	- *Consistent*
		- Brings the database from one consistent state, to another by preserving it's constraints
- **I**
	- *Isolated*
		- It appears to the user as if only one process executes at a time
			- Illusioning to give the idea that both processes aren't happening at once
- **D**
	- *Durable*
		- The effects of a process survives a crash
			- Done by storing the process in data, until it is completed
