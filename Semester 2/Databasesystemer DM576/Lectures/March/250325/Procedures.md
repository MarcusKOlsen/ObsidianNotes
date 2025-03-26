---
updated_at: 2025-03-26T10:19:21.247+01:00
edited_seconds: 230
---
## Definition
Procedures essentially work as functions from conventional programming languages.
## Code
``` PostgreSQL
CREATE PROCEDURE <name>
	([<arguments>]) AS $$
	<program>$$ LANGUAGE <lang>;
```

## Parameters
Unlike the usual name-type pairs in conventional languages, procedures use mode-name-type triples. This **mode** can be:
- IN
	- Function uses value, does not change
		- Read-only
- OUT
	- Function changes, does not use
- INOUT
	- Both
## Example
``` PostgreSQL
CREATE PROCEDURE ChinoMenu (
	IN b CHAR(20), /* Both parameters are IN, meaning read-only */
	IN p REAL
) AS $$
INSERT INTO Sells
VALUES('C.Ch.', b, p);
$$ LANGUAGE plpgsql
```
<center> This procedure takes two arguments, b and p, and adds a tuple with the bar as cafe chino, and the beer as b and price as p. </center>

## Invoking
This is how you invoke something.

### SQL
- You can invoke a PSM statement with the `CALL` statement, with the name of the desired procedure and the arguments

#### Example
```PostgreSQL
CALL ChinoMenu('Eventyr', 50);
```

### PostgreSQL
- You can invoke a PSM statement with the `SELECT` statement, with the name of the desired procedure and the statements

#### Example
``` PostgreSQL
SELECT ChinoMenu('Eventyr', 50);
```