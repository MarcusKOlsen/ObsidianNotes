
> [!Definition]+ Definition
> A sequence is a subset is a function from a subset of $\mathbb{N}$ to some set.
> This is in essence the same as running `map()` in python. The domain is usually $\mathbb{N}$, meaning $\{0,1,2,3, \ldots \}$ is the range in which the sequence runs its functions on.
> 

A sequence can easily be converted into a [[Recursive definitions for inductive proof]] to convey the set in a simple definition

## Differences from [[Recursive definitions for inductive proof]]
- A recursive definition can reference itself, meaning possibilities of formulas like $f_n = f_{n-1} + f_{n-2}$
	- This is not possible in a sequence, as the common ratio (r) and the common difference (d) are constants.
## Examples
- ### Infinite *geometric* sequence
	- ![[Pasted image 20241106122038.png]]
	- <center> An example of running a function on a subset of N</center>
	- #### A simple $1/2$ sequence
	- $\{\frac{1}{n}\}_{n\geq1} = 1, \frac{1}{2}, \frac{1}{4}, \frac{1}{8}, \ldots$
- ### Infinite *arithmetic* sequence
	- ![[Pasted image 20241106122648.png]]
	- <center> Running an infinite arithmetic sequence </center>
## Terminology
- $a_n$: The terminology used to denote the sequence.
	- $\{a_n\}=a_0, a_1, a_2, a_3 \ldots$
- - $a(n) = a_n$
			- The function run on $n$ is the same as running the $a_n$ sequence