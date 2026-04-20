---
updated_at: 2026-04-08T08:54:10.338+02:00
edited_seconds: 410
---
## Definition
A kind of [[String Matching#3 String-Matching with Finite Automata|DFA]] preprocessor
Attempting to fit $P$ onto $T$, but if it doesn't work it tries shifting the $P$ to the right on $T$ to see if that fits
Trying to save time by shifting the text instead of repeating from the bottoma

## Runtime
Preprocessing runtime: $O(m)$
Actual runtime: $O(n)$
Amortized runtime per character: $O_A(1)$

## Formula
$\pi [q] = max\{k | k < q ^ P[:k] \sqsupset P[:q]\}$
$\pi$ prefix function

$T: \space bacbababaabcbab$

| i        | 1   | 2   | 3   | 4   | 5   | 6   | 7   |
| -------- | --- | --- | --- | --- | --- | --- | --- |
| $P[i]$   | a   | b   | a   | b   | a   | c   | a   |
| $\pi[i]$ | 0   | 0   | 1   | 2   | 3   | 0   | 1   |
![[Pasted image 20260408084434.png]]
