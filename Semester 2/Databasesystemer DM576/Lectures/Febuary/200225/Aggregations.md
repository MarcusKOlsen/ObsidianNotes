---
updated_at: 2025-02-20T10:29:52.201+01:00
edited_seconds: 270
---
## Definition
![[Pasted image 20250220102310.png]]

### Uses
- **SUM**
	- Returns the sum of the tuples selected
- **AVG**
	- Returns the average value of tuples selected
		- Lexicographical order for strings
- **COUNT**
	- Returns the amount of tuples
- **MIN**
	- Returns the minimal value of the tuples selected
		- Lexicographical order for strings
- **MAX**
	- Returns the maximal value of the tuples selected
		- Lexicographical order for strings
### Example
![[Pasted image 20250220102439.png]]
## Elaboration
### Eliminating duplicates in an Aggregation
![[Pasted image 20250220102512.png]]

### The use of NULL in an aggregation
#### Elaboration
NULL never contributes to an aggregation (even count)
BUT if there are only NULL values in a column, the result of the aggregation is NULL.
<span class="red"> EXCEPT for COUNT on an empty set, which equals 0 </span>
##### Example
![[Pasted image 20250220102705.png]]


### [[Restrictions on SELECTing with aggregations]]
