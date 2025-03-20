---
updated_at: 2025-03-20T11:31:18.921+01:00
edited_seconds: 970
---
## Definition
- A transaction is a process involving database queries & modification.
	- Often used with strong properties regarding currency
	- Formed in SQL from single statements or programmer control

An operating system supports the interaction of different processes, but a DBMS system does not. Therefore, transactions are used to prevent multiple users from using processes simultaneously.

A process often used to ensure consistency is called [[ACID Transactions]]. This is a type of [[Transaction Isolation Levels|Transaction Isolation Level]]

This is, however, slightly outdated. Many real systems do not implement isolation locks, but instead use [[Multi-Version Concurrency Control (MVCC)]]

## Example
- You and your partner both take $100 from different ATM's at about the same time.
	- The DBMS needs a transaction to make sure one account's deduction does not get lost.
		- **Compare:** an OS allows two people to edit a document together, if both write, one's changes get lost.

## Making a transaction in SQL
- The SQL statement `BEGIN TRANSACTION` marks the beginning of a transaction
	- All following statements are part of the transaction
		- Until either a `COMMIT` or a `ROLLBACK` statement occurs
			- `COMMIT`
				- Causes a transaction to complete
					- Any modification is now permanent in the database
			- `ROLLBACK`
				- Causes a transaction to end
					- Aborting, so no effects to the database
						- Failures like 0 division or constraint violation will also roll back, without the programmer requesting it.
#### Transaction Examples
- In the `Sells(bar,beer,price)` relation, Cafe Chino sells Odense Classic for 20 DKK, and Er.We for 30 DKK.
	- *Peter* is querying `Sells` for the highest and lowest price that Cafe Chino sells.
		- *Peter's* program:
			- `SELECT MAX(price) FROM Sells WHERE bar = "C.Ch";`
			- `SELECT MIN(price) FROM Sells WHERE bar = "C.Ch";`
	- At the same time, **Cafe Chino** is decides to stop selling Odense Classing and Er.We, but to only sell Tuborg at 35 DKK.
		- **Cafe Chino's** program:
			- `DELETE FROM Sells WHERE bar = "C.CH";`
			- `INSERT INTO Sells VALUES ("C.Ch", "Tuborg", 35`)
- SOLUTION
	- If Cafe Chino executes it's modifactions as a transaction, it cannot be seen by others until the transaction executes `COMMIT`.
		- Therefore, *Peter* will either see the old, or the new, depending on timing. There will never be a situation of *Peter* seeing only some of the changes, or his own commands being wrong.
	