---
updated_at: 2025-03-25T11:32:01.095+01:00
edited_seconds: 110
---
## Definition
The state pattern allows the objects to change behavior depending on the state without constantly checking other components to check validity.

## Visual
![[Pasted image 20250325113159.png]]

## Downsides
State-dependent methods can be implemented without explicit checks of state, and new instances can be added with new classes that implement `state`. This creates unpredictability and a bit too much freedom