---
updated_at: 2025-03-20T11:36:14.419+01:00
edited_seconds: 220
---
## Definition
MVCC is a non-locking concurrency control method to provide concurrent access to the database.

- It does this by keeping multiple copies of each data item (kind of like local git repositories)
	- Each user has a *snapshot* of the database at a particular instant in time
		- Won't overwrite the original data item with new data
			- Instead creates a newer version of the data item.
	- Any change made by a writer will not be seen by others until the changes have been completed

MVCC uses
- Timestamps (TS)
- Incrementing transaction IDs
To achieve transactional consistency
