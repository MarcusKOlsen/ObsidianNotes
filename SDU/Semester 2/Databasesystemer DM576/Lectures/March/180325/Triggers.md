---
updated_at: 2025-03-18T12:58:32.949+01:00
edited_seconds: 870
---
## Definition
![[Pasted image 20250318124321.png]]

More flexible than an assertion.

Another name for a trigger is an ECA - event-condition-action rule:

- Event: Typically a database modification
- Condition: Any SQL boolean-returning expression
- Action: Any SQL statement

### Examples
![[Pasted image 20250318124447.png]]
<center> Instead of simply not allowing the insertion, we can fix this so we simply insert with a NULL value. A simple example, but very flexible </center>

## Code
``` SQL
CREATE TRIGGER BeerTrig
	AFTER INSERT ON Sells -> **The event**
	REFERENCING NEW ROW AS NewTuple
	FOR EACH ROW
	WHEN (NewTuple.beer NOT IN 
		(SELECT name FROM Beers)) -> **The Condition**
	
	INSERT INTO Beers(name)
		VALUES(NewTuple.beer); -> **The Action**
```

#### Options
- `CREATE TRIGGER`
	- `CREATE TRIGGER <name>`
	- `CREATE OR REPLACE TRIGGER <name>`
		- Useful if you want to modify a trigger.
- **Event**
	- `AFTER`
	- `BEFORE`
	- `INSTEAD OF`
		- If the relation is a view
	- `INSERT`
		- `DELETE`
		- `UPDATE`
			- `UPDATE ON <a particular attribute>`
- `FOR EACH ROW`
	- row-level
		- Executes once for each modified tuple
			- If `FOR EACH ROW` is stated, a row-level trigger is indicated. Its absence indicates a statement-level trigger.
	- statement-level
		- Executes once for an SQL statement, regardless of how many tuples are modified
- `REFERENCING`
	- `INSERT`
		- row-level
			- Imply a new tuple
		- statement-level
			- Imply a new table
				- The 'table' is the set of inserted tuples
	- `DELETE`
		- Implies an old tuple or table
	- `UPDATE`
		- Implies both `INSERT` & `DELETE`
- **The Condition**
	- Any condition that returns a boolean
	- Evaluates the database as if it exists either `BEFORE` or `AFTER` any modification, depending on the which is used.
	- Accesses the new or old tuple/table through the names used to define them in the `REFERENCING` clause.
- **The Action**
	- There can be more than one statement
		- Surround by `BEGIN ... END` if there are multiple statements.
	- Queries make no sense here, so the action is limited to a modification
#### When to use row | statement level triggers
- row-level
	- Auditing individual row changes
	- Enforcing data validation
	- Automatically updating related tables whenever a row is modified
	- Generating derived or default values
- statement-level
	- Bulk Operations
		- Auditing or restricting bulk operations
		- Enforcing rules for batch operations
	- Performance Considerations
		- Less executions, stops SQL from running multiple times for every tuple in a row
	- DDL Monitoring
		- When tracking schema modifications
	- Aggregation Updates
		- When recalculating [[Aggregations]] after batch operations