---
updated_at: 2025-03-18T13:17:24.150+01:00
edited_seconds: 100
---
## Changes
- PostgreSQL don't allow events for only certain columns
- Rows and tables are called `OLD` and `NEW`. 
	- `REFERENCING ... AS` is not allowed :/
- PostgreSQL only allows [[Functions in PostgreSQL|functions]] to execute in the action statement
	