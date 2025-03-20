---
updated_at: 2025-03-20T10:36:55.825+01:00
edited_seconds: 300
---
## Definition
A view is a relation defined in terms of stored tables (called ***base tables***).
Essentially, a view is a relation defined based on something that exists. Therefore, a view is not necessarily stored in a database.

A view is something stored to access and look at databases efficiently.
Someone cannot go in and modify the base table in any way through a view.

## Kinds of views
- [[Virtual Views|Virtual]]
	- Not stored in database; just a query for constructing the relation
- [[Materialized views|Materialized]]
	- Actually constructed and stored
## Declaring Views
Declared by:
``` PostgreSQL
CREATE [MATERIALIZED] VIEW
<name> AS <query>;
```

- The default value is virtual. Therefore you can add `[MATERIALIZED]` to make it stored.
- Virtual view has some advantages and disadvantages.
	- Advantage -> It will always return the latest data
	- Disadvantage -> Lower performance
