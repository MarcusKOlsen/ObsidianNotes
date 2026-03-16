---
updated_at: 2026-03-16T11:11:31.151+01:00
edited_seconds: 630
---
## Terminology
$n$ keys 
$m$ table size 
$m \geq n$ (ideally with low probability of multiple things hitting same $n$)
$max$ chain length $= O(\frac{logn}{loglogn})$
$p$ prime number
$\mathbb{Z}_p = \{0,1,2, p-1 \}$
$\mathbb{Z}^*_p = \mathbb{Z}$, without $\{0\}$

## Definition
Extension of hashing that ensures that no matter what input, it gets good results.
Instead of using a hash function, one chooses a random hash function, chosen from a [[Universal Hashing#Universal Family|Universal Family]]

### Universal Family
$k_1 \neq k_2$, $P(h(k_1) = h(k_2))$ should be $\leq \frac{1}{m}$ 

#### Universal Family Design
Choose prime $p$ larger than any $k$, and larger than $m$.
$$a \in \mathbb{Z}_p^*$$$$b \in \mathbb{Z}_p$$
$$h_{a,b}(k) = ((a \times k + b) mod \space p) mod \space m$$
$$H_{p,m} = \{h_{ab} | a \in \mathbb{Z}_p^*, b \in \mathbb{Z}_p \}$$

