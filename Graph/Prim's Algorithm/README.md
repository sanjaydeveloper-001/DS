# Prim's Algorithm - Minimum Spanning Tree (MST)

## Problem Statement
You are given an **undirected, connected, and weighted graph** `G(V, E)` where:
- `V` = number of vertices (numbered `0` to `V-1`)
- `E` = number of edges  

Your task is to find and print the **Minimum Spanning Tree (MST)** using **Prim's Algorithm**.

### Output Rules
1. Each edge of the MST must be printed in the format:
where `v1` and `v2` are the vertices, and `w` is the weight.  
Ensure `v1 <= v2`.  
2. Print exactly `V-1` edges (since MST has `V-1` edges).  
3. The order of edges does not matter.  

---

## Input Format
- Line 1: Two integers `V` and `E` (separated by space).  
- Next `E` lines: Three integers `ei ej wi`, denoting an edge between vertex `ei` and vertex `ej` with weight `wi`.

---

## Constraints
- `2 <= V, E <= 10^5`  
- `1 <= Wi <= 10^5`  
- Graph is **undirected and connected**.  
- **Time Limit**: 1 second  

---

## Output Format
Print the MST edges as described in the task.

---


## Sample Input
````
4 4
0 1 3
0 3 5
1 2 1
2 3 8
````

## Sample Output
````
0 1 3
1 2 1
0 3 5
````


---

## Approach
1. **Representation**: Store the graph as an adjacency matrix or adjacency list.  
2. **Initialization**: Start from vertex `0`, mark it visited.  
3. **Iterative process**:
   - At each step, select the **minimum weight edge** that connects a visited vertex to an unvisited vertex.  
   - Add this edge to the MST.  
   - Mark the new vertex as visited.  
4. Repeat until all vertices are visited (`V-1` edges chosen).  

**Complexity**:  
- Using adjacency matrix: `O(V^2)`  
- Using priority queue + adjacency list: `O(E log V)`  

---
