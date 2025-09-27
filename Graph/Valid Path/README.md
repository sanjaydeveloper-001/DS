# Valid Path in a Graph using DFS

## Problem Statement
You are given an **undirected graph** with `n` vertices and `m` edges.  
Your task is to determine whether there exists a **valid path** from a given starting vertex to an ending vertex.  

- A valid path is defined as a sequence of vertices such that there is an edge between every pair of consecutive vertices in the sequence.  
- Use **Depth First Search (DFS)** to solve this problem.

---

## Input Format
1. First line: Two integers `n` and `m`  
   - `n` → Number of vertices  
   - `m` → Number of edges  
2. Next `m` lines: Two integers `u v`, representing an **undirected edge** between vertices `u` and `v`.  
3. Last two lines:  
   - `start` → Starting vertex  
   - `end` → Ending vertex  

---

## Constraints
- `1 ≤ n ≤ 10`  
- `0 ≤ m ≤ n * (n - 1) / 2`  
- `0 ≤ u, v < n`, `u ≠ v`  
- `0 ≤ start, end < n`, `start ≠ end`  

---

## Output Format
- If there is a valid path:  
- There is a path from [start] to [end]
- Otherwise:  
- There is no path from [start] to [end]

---

## Sample Output
````
5 4
0 1
1 2
2 3
3 4
0
5
````
## Sample Input
````
There is no path from 0 to 5
````

---

## Approach
1. **Build the graph** using an adjacency list.  
2. Use a **visited set/array** to keep track of visited nodes.  
3. Perform **DFS starting from `start`**:
   - Recursively explore neighbors until either the `end` node is reached or all reachable nodes are visited.  
4. If `end` is found during DFS → path exists. Otherwise, no path.  

**Complexity:**  
- Time Complexity: `O(V + E)`  
- Space Complexity: `O(V + E)`  

---
