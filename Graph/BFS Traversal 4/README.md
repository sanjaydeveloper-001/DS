# BFS Traversal of a Graph (Undirected & Disconnected)

## Problem Statement
You are given an **undirected and disconnected graph** `G(V, E)` represented using an adjacency matrix.  
Your task is to perform **Breadth First Search (BFS) traversal**, starting from vertex `0`.  

- If the graph is disconnected, BFS should continue for all unvisited vertices.  
- Vertices are numbered from `0` to `V-1`.  

---

## Input Format
1. First line: Two integers `V` and `E`  
   - `V` → Number of vertices  
   - `E` → Number of edges  
2. Next `E` lines: Two integers `a b`, representing an edge between vertex `a` and vertex `b`.  

---

## Constraints
- `0 ≤ V ≤ 1000`  
- `0 ≤ E ≤ (V * (V - 1)) / 2`  
- `0 ≤ a, b < V`  
- Graph is undirected (so edge `(a, b)` means both `(a, b)` and `(b, a)` exist).  
- **Time Limit**: 1 second  

---

## Output Format
Print the BFS traversal order, starting from vertex `0`.  

---

## Sample Input
````
4 4
0 1
0 3
1 2
2 3
````


## Sample Output
````
0 1 3 2
````


---

## Approach
1. **Build the adjacency matrix** from the input.  
2. Maintain a **visited array** to track visited vertices.  
3. Use a **queue** to perform BFS:  
   - Start from vertex `0`.  
   - Visit all its neighbors.  
   - Continue until all vertices are visited.  
4. If the graph is disconnected, repeat BFS for unvisited vertices.  

----

