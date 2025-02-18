Relations describe connections between elements of different sets.
Useful for many things, f.eks. databases
## Definition
In essence, that a relation can be seen as a generalization of functions
- A function assigns precisely one element from B to every element in A
- A relation assigns *any number* of elements from B to every element in A
### Binary Relations
A binary relation from A to B is a subset of $A \bigtimes B$
For examples, look at [[Cartesian product of sets]]

#### Notation
When R is a relation and $(a,b) \in R$, one can also write $a R b$

#### Representations
There are different representations of a relation:
- Set
	- A set can describe a relation, f.eks. with the use of [[Set Builder Notation]]
- A directed graph
	- Visually describes a relation
- As a matrix
	- More to come

#### Examples
$A = \{1,2,3\}, and, R_< = \{(1,2), (1,3), (2,3)\} \subseteq A \bigtimes A$  

## Properties
### Reflexivity
A fancy way of saying all elements of a relation also refers to itself, meaning in a relation where you f.eks. are creating a relation between odd and even numbers, the even numbers will also relate to itself, since f.eks. an even number like 2, is also even, and therefore relates to itself. If every element in the relation does this, it is reflexive
$(a,a) \in R$ for all $a \in A$
### Irreflexivity
A fancy way of saying no elements of a relation refers to itself
$(a,a) \notin R$, for all $a \in A$

[[Reflexisivty and Irreflexisvity examples]]

A relation can never be both, but there are relations that are neither reflexive nor irreflexive

### Symmetry
A relation R is considered symmetric if
$(a,b) \in R \rightarrow (b,a) \in R$

### Anti-symmetry
A relation R is considered antisymmetric if
$(a,b) \in R \rightarrow (b,a) \notin R$ for all $a,b \in A$ with $a \not = b$

A relation can be symmetric and/or antisymmetric, or it can also be none.

### Transitivity
A relation R is considered *transitive* if 
$((a,b) \in R \land (b,c) \in R) \rightarrow (a,c) \in R$

Meaning if a relation is transitive, there is a clear starting point and end point
[[Transitivity Example]]
## Closures
Closures are the act of changing a relation to fit the needs of whatever property a relation is missing
### Reflexive Closure
A reflexive closure is the process of adding reflexivity to a relation without it.
This includes adding 'loops' ([[Reflexisivty and Irreflexisvity examples]]) to the relation.
For example it involves adding specific elements that relate to themselves. 
						f.eks. $(1,1), (2,2), (3,3)$
Into a relation that is without self-referencing

### Symmetric Closure
A symmetric closure is the process of adding symmetry to a relation without it
This means adding 'arrows' back and forth on all elements ([[Reflexisivty and Irreflexisvity examples]])
For a relation $R=\{(1,2),(2,3),(3,1)\}$ this means adding $(1,3),(3,2),(2,1)$ to $R$

### Transitive closure
Because $(a,b)$ and $(b,c)$ implies $(a,c)$, therefore to make a transitive closure in a relation where this is not already true, you must create an 'arrow' $(a,c)$
([[Transitivity Example]])
[[Transitive Closure explanation]]
