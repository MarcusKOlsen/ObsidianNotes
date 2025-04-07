## Definition
The conceptual Data Model is used for defining the structure of the data that can be stored.
This step is independent of the specific DBMS used

## Entity-Relationship (ER) model
![[Pasted image 20241101112032.png]]
<center>This is the most widely used model for relational DBMS</center>
### Definition
ER databases are designed around ownership. An entity can own some other entity. These relations usually have a cardinality, meaning this ownership only moves in one direction.
A car can f.eks. never own a person.

#### Example
![[Pasted image 20241101112145.png]]
<center>In this database, one car is owned by *exactly* one person. This is not necessarily true for all data in the database, but this models the expectations of the system.</center>

