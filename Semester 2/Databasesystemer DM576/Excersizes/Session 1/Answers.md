---
updated_at: 2025-02-07T13:33:41.719+01:00
edited_seconds: 690
---
# 2.1 )

![[Pasted image 20250207125720.png]]

## a)
![[Pasted image 20250207125634.png]]
## b)
![[Pasted image 20250207125642.png]]
![[Pasted image 20250207125647.png]]
## c)
![[Pasted image 20250207125700.png]]
![[Pasted image 20250207125706.png]]
## d)
- Accounts( acctNo, type, balance)
- Customers(firstName, lastName, idNo, account)
## e)
![[Pasted image 20250207125821.png]]
## f)

	acctNo: INT
	type: VARCHAR(8)
	balance: real

	firstName: VARCHAR(20)
	lastName: VARCHAR(20)
	idNo: CHAR(7)
	account: INT
## g)
### Accounts
	acctNo: CHAR(5)
	savingsOrCheckings: BOOLEAN
	balance: real
### Customers
	lastNameFirstName: VARCHAR(100)
	idNo: CHAR(7)
	account: CHAR(5)

# 2.2)

## Relation *Balls*

| name     | ballAmount | <u>penileLength</u>(cm) | <u>height</u>(cm) |
| -------- | ---------- | ----------------------- | ----------------- |
| David    | 2          | 3                       | 124               |
| Marcus   | 5          | 105                     | 230               |
| Isabella | 0          | -3                      | 100               |

# 2.3)
## a)
6
## b)
24
## c)
$n!$


# 3.1)
```
Product(VARCHAR(50) maker, INT model,  VARCHAR(7) type)
```