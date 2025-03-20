---
updated_at: 2025-03-20T10:29:30.013+01:00
edited_seconds: 400
---
## Problems & Solutions
- Problem:
	- Each time the base table is updated, the materialized view may change
		- Costly in performance to constantly update it every time a modification is added
		
- Solution:
	- Save the results of the underlying query to a table
		- Advantage -> Performance
		- Disadvantage -> The data is only as up to date as the last time the view has been [[Materialized views#Refreshing materialized views|refreshed]].
## Refreshing materialized views
- Reconstruction types:
	- Manual
	- On a set schedule
	- Based on the database detecting a change
	- PostgreSQL support:
		- manual
		- [[Triggers|trigger-based]]

## Example
- Bilka
	- Stores every sale on a database
	- After closing, the materialized view is updated since nothing is being changed overnight. This materialized view is defined as `data warehouse`
		- `data warehouse` is used by analysts to predict trends and move goods around.