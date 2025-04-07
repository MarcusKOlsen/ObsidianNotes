---
updated_at: 2025-03-20T11:51:15.276+01:00
edited_seconds: 400
---
## Definition
An index is a data structure used to grant quicker access to tuples of a relation, given values of one or more attributes

Can be done with hash tables, but in a DBMS it is often a binary balanced search tree with giant nodes. This is called a ***B-tree***

Using indexes effeciently is called [[Database Tuning with indexes|Database Tuning]]


### Creating Indexes
There is no standard, but there is some typical syntax:
```
CREATE INDEX BeerInd ON Beers(manf);
CREATE INDEX SellInd ON Sells(bar,beer);
```

### Using Indexes
Given a value `v`, he index takes us the the only tuples that contain `v` in the attribute of the index.

``` PostgreSQL
SELECT price FROM Beers
WERE manf = 'Albani' AND
	Beers.name = Sells.beer AND 
	bar = 'C.Ch.';
```
<center> Use the Beer index to find all beers made by Albani, then use Sell Index to get prices of those beers, where the bar is Cafe Chino. </center>

