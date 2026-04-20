---
updated_at: 2026-04-08T08:28:25.434+02:00
edited_seconds: 160
---
Continuation of [[String Matching]]

## Computing $\delta$
```python
Compute-Transition(P, alphabet, m)
	for q=0 to m
		for each a in alphabet
			k = min{m, q+1}
			while P[:k] not suffix of P[!q]a
				k = k-1
		return k
```
