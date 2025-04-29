---
updated_at: 2025-02-18T13:22:38.054+01:00
edited_seconds: 300
---
## Excersize
![[Pasted image 20250218123239.png]]

### c)

```SQL
SELECT name
FROM Ships
WHERE class IN
(
	SELECT class
	FROM Classes
	WHERE bore = 16;
)
```
### d)
``` SQL
SELECT battle
FROM Outcomes
WHERE ship IN
(
	SELECT name
	FROM Ships
	WHERE class = 'Kongo'
)
```