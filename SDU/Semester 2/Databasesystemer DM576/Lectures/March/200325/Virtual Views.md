---
updated_at: 2025-03-20T10:38:20.672+01:00
edited_seconds: 410
---
## Definition
- Only a query is stored
- No need to change the view when the base table changes
- Expensive if often used

## Defining a view
``` PostgreSQL
CREATE VIEW CanDrink AS
	SELECT drinker, beer
	FROM Frequents, Sells
	WHERE Frequents.bar = Sells.bar;
```
`CanDrink(drinker,beer)` is a view containing the drinker-beer pairs. So they are easily viewable

## Modifying Virtual Views
- It is impossible to modify a virtual view, as it doesn't exist.
	- However, SQL provides some rules for when modifications to a view are permitted.
		- These [[Virtual Views#Modification Rules|modification rules]] permit modifications on views that are defined by selecting (only `SELECT`, not `SELECT DISCINCT`) some attributes from one relation R
- Alternatively, we can use an `instead of` trigger, that lets us interpret view modifications in a way that makes sense
## Modification Rules
- The `WHERE` clause must not involve the relation **R** in a subquery.
- The `FROM` clause can only consist of one occurence of **R** and no other relation.
- The list in the `SELECT` clause must include enough attributes for every tuple inserted into the view
	- For example, projecting out a **NOT NULL** value with no default is not permitted.