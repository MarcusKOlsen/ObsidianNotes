---
updated_at: 2025-03-20T11:53:39.724+01:00
edited_seconds: 130
---
### Definition
- Deciding what indexes to create is vital for making your database run fast
	- <span class="green"> Pro: </span>
		- An index speeds up queries that use it.
	- <span class="red"> Con: </span>
		- The index must also be modified every time the database is modified.

This is very hard to tune by hand, we therefore use:

## Tuning Advisors
- An advisor uses a *query load* a query load can either be:
	- A random set of queries from the history run on the database
	- A hand-picked sample of the workload

- With this *query load*, the advisor generates candidate indexes and evaluates the workload through a query optimizer
	- The query optimizer uses a single index at a time, and measures the improvement/degradation in the average running time