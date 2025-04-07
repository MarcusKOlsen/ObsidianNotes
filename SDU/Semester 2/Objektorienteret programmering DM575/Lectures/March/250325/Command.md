---
updated_at: 2025-03-25T11:27:01.940+01:00
edited_seconds: 160
---
## Definition
Creates a central command point from which programs are run, allowing a single place to modify the code, making edits much easier
## Downsides
Distances the actual command from the class running it, leaving the code slightly obfuscated. 
## Visual
![[Pasted image 20250325112416.png]]
<center> The command interface is a blueprint, the ConcreteCommand contains all the necessary information and parameters, the Receiver then runs the command from the ConcreteCommand class</center>
