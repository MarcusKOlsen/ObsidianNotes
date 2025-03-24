---
updated_at: 2025-03-24T10:32:18.184+01:00
edited_seconds: 330
---
## Definition
- Can accept **new tasks** in the form of described goals
- Can achieve **competence** by learning / being told about the world
- Can **adapt to changes** in the world by updating it's **competence** & knowledge.

An example of the knowledge-based agent is the [[Wumpus World]]

## Knowledge Base
![[Pasted image 20250324102101.png]]
The knowledge base contains:
- A set of sentences in a **formal language**
	- Comes with a way to add new sentences (**TELL**)
		- & A way to query what is known (**ASK**)
			-
- **Knowledge Level**
	- Describing the agent by what it knows
- **Implementation Level**
	- Describing the agent by what it does
## Combining **ASK** & **TELL** to apply inferences
 With **ASK & TELL**, the knowledge base can add some **axioms** & sentences together to create sentences that "follow" from other sentences. This is called <span class="green">inferences</span>, which can be used to prove propositional theories.
 ![[Pasted image 20250324103232.png]]

## Generic Knowledge Base Pseudocode
![[Pasted image 20250324102415.png]]
