---
updated_at: 2025-03-25T11:30:10.969+01:00
edited_seconds: 150
---
## Definition
The observer exists to allow the program components to react to actions from other components in the program, without leaving a direct attachment to them.
The observer runs `notify()` when something happens in one class, and then sends that along to some (unconnected to the original class) secondary class.

## Visual
![[Pasted image 20250325112929.png]]
## Downsides
Makes classes more responsive and less attached to the other code by not using periodic checks.
