---
updated_at: 2025-03-27T10:35:54.225+01:00
edited_seconds: 550
---
## Recursion Trees
Recursion trees are used to describe each recursive call that a divide-and-conquer algorithm calls. The purpose of this is to visualize the work done in each split, commonly called *local work*. Finding the sum of the *local work* is essential, as it describes (in plain numbers) the total amount of work done by the algorithm.
![[Pasted image 20250327102424.png]]
<center> The highlighed parts are all the local work </center>
## Calculating the amount of work

A few things are needed. First off, for each node in the tree, annotate it with the following:
- The **input size** for the call to the node
- The resulting *work done in the node*
Afterwards you can find the sum of all work in the tree like this:
- Find the height of the tree (amount of layers, colloquially the amount of splits)
- Add every node in the same layer together
- Then add the resulting sums for all layers

There are three other cases. These are representative, meaning that there is often at least *one* that fits:
1. All layers in the recursion tree has ca. the same sum, wherein the total sum is the amount of layers, times this sum.
2. The layers sum grows exponentially towards the bottom, where the bottommost layer dominates. To find this kind of sum, you need the height of the tree
3. The layers sum shrinks exponentially towards the bottom, wherein the topmost layer dominates

There exists a generic solution of these three cases (book page 102-3). This solution is called the [[Master Theorem]]


### Example 1
![[Pasted image 20250327102813.png]]
![[Pasted image 20250327102836.png]]
### Example 2
![[Pasted image 20250327102917.png]]

# Time
![[Pasted image 20250327102207.png]]
<center> T(n) is in this instance the worst case for the algorithm </center>
### Mergesort
![[Pasted image 20250327102231.png]]