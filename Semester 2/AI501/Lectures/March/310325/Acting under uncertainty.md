---
updated_at: 2025-03-31T11:34:56.901+02:00
edited_seconds: 400
---
## Problem
The real world contains **uncertainties** due to:
- Partial observability
- Nondeterminism
- Adversaries

Propositional logic is also difficult:
- Dental Diagnosis $toothache -> cavity$
	- Not every patient has a toothache because of a cavity
		- So $toothache -> cavity \lor gum problem \lor absess ...$
			- An exhaustive list is needed to complete
				- Sometimes the list cannot be fully filled

## Solution
There are multiple ´solutions´ to manage this problem:
- **Probability Theory**
	- Tools to deal with degrees of belief of relevant sentences
	- Summarizes the uncertainty that comes from the mentioned [[Acting under uncertainty#Problem|problems]]

- **Utility Theory**
	- Determining choice by the quality of the outcome being useful
		- Every state has  degree of usefulness/utility
			- [[Simple Searches#Greedy Search|Greedy Search]] is an example of this
- **Decision Theory**
	- Decision theory is using preferences(**utility theory**) combined with probabilities(**probability theory**)
		- An agent is **rational** if and only if it chooses the action that yields the highest expected **utility**, averaged over all possible **outcomes/probabilities**
			- The principle of Maximum Expected Utility (MEU)
			- [[Decision-theoretic agent]]

