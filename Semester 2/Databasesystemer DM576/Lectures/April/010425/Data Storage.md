---
updated_at: 2025-04-02T11:27:32.528+02:00
edited_seconds: 680
---
## Definition
Databases are usually too large to keep in a cache or the RAM, therefore secondary storage is needed

Tables are typically kept in this *secondary storage*
Large amounts of data that are infrequently used are stored in **tertiary storage**

## Random vs Sequential Access
([[Random Access]])

## Accelerating Access
There are different ways to increase access speeds:
- Duplicate disks
	- Disks with the same information in different blocks
	- Pros 
		- Increases access speed and creates backups for safety
	- Cons
		- Slower writing speed, one duplicate would double the writing time
		- Redundant space, a lot of wasted hard disks
- Reordering requests to minimize movement of the disk
	- Fast. Kachow


## Memory Hierarchy
1. Cache
	- Speed: 0.3 nanoseconds
	- Cost: a lot /mb
2. RAM
	 - Speed: 1.5 nanoseconds
	 - Cost: 30 / gb
3. Hard Drive
	- Speed: 0.1 milliseconds
	- Cost: 8 / gb
4. Magnetic Tapes
	- Speed: 7.5 milliseconds 
	- Cost: not too much
<center> Increasing in latency downwards </center>

### Hard Drives
- N rotating magnetic platters
	- Divided into sectors that have gaps on either side that are non-magnetic
		- Call a **page
			- These sectors/pages have multiples of itself divided
				- These are called *blocks*
	- The speed/latency is caused by a few things:
		- Too slow of a rotation speed. This is called <span class="green"> Rotational Latency </span>
			- Best case: 0, if the platter is already in place
			- Average case: max_rotation / 2
		- The speeds of the reading heads. This is called <span class="yellow"> Seek time </span>
			- Best case: 0
			- Worst case max_seek / 3
	
- 2xN heads for reading & writing
	- These heads read & write from/onto *blocks*
- Has a track, cylinder, sector & gap