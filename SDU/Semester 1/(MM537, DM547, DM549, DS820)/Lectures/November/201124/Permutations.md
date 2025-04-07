---
updated_at: 2024-12-20T01:56:27.740+01:00
edited_seconds: 580
---
	## Definition
In a set, in how many ways can you create an ordered partial set from it? This is defined as the permutation. The order matters.

If the order doesn't matter, it is a [[Combinations]]

An $n$-permutation of $S$ is an ordered arrangement of $n$ distinct objects from $S$
![[Pasted image 20241120121751.png]]

## Application
![[Pasted image 20241120121802.png]]

### Example
Say that a set of teams has cardinality 5. How many different ways are there to put them in different places?

$5*4*3*2*1 = 5!$

Let's instead say that we only want the top three.

$5*4*3 = \frac{5!}{(5-3)!} = \frac{5!}{2!}$

This statement is simplified to:
$P(n,r) = \frac{n!}{(n-r)!}$
With $n$ and $r$ being integers with $0 \leq r \leq n$.

$P$ is the common name used for permutations. This is the example shown in [[#Tournament ! Pasted image 20241120122015.png|Tournament]]
## Example
### Tournament 
![[Pasted image 20241120122015.png]]

### 5 Cards
![[Pasted image 20241120123354.png]]
Using $P(n,r)$ we can figure this out:
$n = 52$
$r = 5$

$P(52,5)=\frac{52!}{(52-5)!} = 311875200$
