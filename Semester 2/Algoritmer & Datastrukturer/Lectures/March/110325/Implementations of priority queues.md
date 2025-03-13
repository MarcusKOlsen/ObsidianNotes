---
updated_at: 2025-03-11T08:28:30.528+01:00
edited_seconds: 150
---
## Implementing priority queues with heapsort
![[Pasted image 20250311082605.png]]

### Implementing INCREASE-KEY in heapsort
![[Pasted image 20250311082633.png]]
<center class="green"> Swap the bottom-most node with its parent recursively until the heap order is once again fixed. </center>
#### Køretid
![[Pasted image 20250311082734.png]]
### Implementing INSERT in heap order.
![[Pasted image 20250311082815.png]]
<center class="green"> Insert the new element at the very end, then run increase-key until heap order is complete. </class>
