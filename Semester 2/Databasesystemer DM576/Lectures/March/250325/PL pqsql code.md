---
updated_at: 2025-03-26T10:35:54.090+01:00
edited_seconds: 950
---
## Kinds of PL/pqsql statements
- `RETURN <expression>`
	- Returns the value of a function
		- Like Java, `RETURN` terminates the function execution
- `DECLARE <name> <type>`
	- Used to declare local variables
- `BEGIN ... END`
	- Used to group statements.
		- Separate each statement by semicolons
- `<variable> := <expression>
	- Assignment statement, assigning a value to a variable.
- IF Statements
	- Simplest form
		- `IF <condition> THEN <statement(s)> END IF;`
			- Can be expanded with else
				- `IF ... THEN ... ELSE ... END IF;`
					- Can be expanded with elseif
						- `IF ... THEN ... ELSE ... ELSEIF ... THEN ... ELSE ... END IF;`
- Loops
	- Basic form
		- `<<<label>>> LOOP <statements> END LOOP;`
			- Exiting from a loop is done thIs way:
				- `EXIT <label> WHEN <condition>`
	- Other loop forms
		- `WHILE <condition> LOOP <statements> END LOOP;`
			- Like a traditional while loop
		- `FOR <name> IN <start> TO <end> LOOP <statements> END LOOP`
			- Like  a traditional for loop
## Queries
General SELECT-FROM-WHERE queries are **not** permitted in PL/pgsql
There are three ways to replicate the effect however:
- Queries producing one value can be the expression in an assignment of a variable
- Single-row SELECT ... INTO
	- You can circumvent this by writing something like `SELECT price INTO p FROM Sells WHERE bar = 'C.ch`. This will save the selection into a variable `p`
- Cursors
	- A cursors is a tuple-variable that ranges over all tuples in the result of some query
		- Declaration
			- `DELCARE c CURSOR for <query>;`
		- Usage
			- To use the cursor `c`, we must issue the command:
				- `OPEN c;`
					- This is when the query is evaluated
			- Fetching tuples from a cursor
				- To get the next tuple from cursor c, issue command:
					- `FETCH FROM c INTO x1, x2, ..., x_n;`
						- The x values need to be however long as the tuples you are fetching from
					- `c` is afterward moved automatically to the next tuple
						- Almost identical to java iterators.
			- Breaking cursor loops
				- The only way to properly use a cursor is to create a loop using the `FETCH` statement, and do something with each tuple checked
					- A simple way to check if the cursor has finished iterating is with a built in variable called `FOUND`
						- `IF NOT FOUND THEN EXIT cursorLoop;`
			- To close the cursor we must issue the command:
				- `CLOSE c;`