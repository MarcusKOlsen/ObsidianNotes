---
updated_at: 2025-03-20T11:29:20.383+01:00
edited_seconds: 820
---
## Definition
SQL defines four *isolation levels*. These are choices about what interactions are allowed by transactions that execute at the same time

Each DBMS implements transactions in its own way.

## Setting the isolation level
Within a transaction, we can say:
``` PostgreSQL
SET TRANSACTION ISOLATION LEVEL X
```
### The 4 isolation levels (x)
1. `SERIALIZABLE`
	- [[ACID Transactions]] use this.
	- If the [[Transactions#Transaction Examples|Peter & Cafe Chino]] example uses this, *Peter* will be able to see the database either before, or after modification. 
	- Running `SERIALIZABLE` is a personal choice, so if Cafe Chino uses it but *Peter* doesn't, he might think it ran in the middle of Cafe Chino's transaction
2. `REPEATABLE READ`
	- Runs just like `READ COMMITTEDE`, with the addition of:
		- If the data is read again, then everything seen the first time will be seen the second time again
			- But the second & subsequent reads will simply see an addition of tuples instead
				- In the [[Transactions#Transaction Examples|Peter & Cafe Chino]] example, he will see the price of Odense Classic, Er.We, AND Tuborg.
3. `READ COMMITTED`
	- In the [[Transactions#Transaction Examples|Peter & Cafe Chino]] example, if it is run with this isolation level, *Peter* will see whatever is changed each commit. Meaning, if **Cafe Chino** and *Peter* run interleaving commands, as long as **Cafe Chino** commits in between, *Peter* will see different values each time he looks.
		- For example, *Peter* might see MAX < MIN. Which would probably confuse him
4. `READ UNCOMMITTED`
	- A transaction running in this isolation level can see data in the database during the transaction, even if it was written by a transaction that has not, and may never, commit.
	- In the [[Transactions#Transaction Examples|Peter & Cafe Chino]] example, this will end up showing the change to Tuborg, even the transaction never finishes.

## Overview

| Isolation Level    | Dirty Reads                          | Nonrepeatable Reads                  | Phantoms                             |
| ------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `READ UNCOMMITTED` | <span class="green">Allowed</span>   | <span class="green">Allowed</span>   | <span class="green">Allowed</span>   |
| `READ COMMITTED`   | <span class="red">NOT ALLOWED</span> | <span class="green">Allowed</span>   | <span class="green">Allowed</span>   |
| `REPEATABLE READ`  | <span class="red">NOT ALLOWED</span> | <span class="red">NOT ALLOWED</span> | <span class="green">Allowed</span>   |
| `SERIALIZABLE`     | <span class="red">NOT ALLOWED</span> | <span class="red">NOT ALLOWED</span> | <span class="red">NOT ALLOWED</span> |
<center> Serializable is peak </center>

