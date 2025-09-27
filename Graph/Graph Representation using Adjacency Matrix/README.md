# Graph Representation using Adjacency Matrix

## Problem Statement -> [Image](https://s3.amazonaws.com/hr-assets/0/1722058018-58c88becfa-hc.png)
You are given a graph in terms of its number of vertices and edges. Your task is to construct its **adjacency matrix representation**.  

- The graph can be **directed** or **undirected**, and each edge has a **weight**.  
- The first two inputs are the number of vertices and edges.  
- Then input whether the graph is directed or undirected, followed by the edge list.  

---

## Input Format
1. First line: An integer `V` — the number of vertices in the graph.  
2. Second line: An integer `E` — the number of edges.  
3. Third line: A string — `"yes"` if the graph is directed, `"no"` if the graph is undirected.  
4. Next `E` lines: Each line contains three integers `u v w`, denoting an edge from node `u` to node `v` with weight `w`.  

### Example Input
```
5
6
no
0 1 1
1 4 1
2 4 1
0 2 1
3 4 1
0 3 1
```

---

## Constraints
- 1 ≤ V ≤ 100  
- 0 ≤ E ≤ V*(V-1)  
- 0 ≤ u, v < V  
- 0 ≤ w ≤ 100  
- The graph may have self-loops (i.e., u == v is allowed).  

---

## Output Format
- Print the **V x V adjacency matrix**.  
- Each row should contain `V` space-separated integers.  
- If there is no edge between two vertices, the value should be `0`.  

### Example Output
```
0 1 1 1 0
1 0 0 0 1
1 0 0 0 1
1 0 0 0 1
0 1 1 1 0
```

---

## Explanation
- The graph is undirected, so every edge `u v w` implies both `matrix[u][v] = w` and `matrix[v][u] = w`.  
- The matrix represents edge weights; `0` means no edge.  

For example, the edge `0 1 1` creates both `matrix[0][1] = 1` and `matrix[1][0] = 1`.

---

## Approach
1. Initialize a `V x V` matrix filled with `0`.  
2. For each edge `(u, v, w)`:
   - Set `matrix[u][v] = w`.  
   - If the graph is undirected, also set `matrix[v][u] = w`.  
3. Print the adjacency matrix row by row.

---

## Pseudocode
```text
read V
read E
read directed_flag ("yes" or "no")

initialize matrix[V][V] with 0

for each edge:
    read u, v, w
    matrix[u][v] = w
    if graph is undirected:
        matrix[v][u] = w

for i in range(V):
    print matrix[i] as space-separated integers
```

---

## Graph Visualization
You can include a visual representation of your graph here:

![Graph Example](graph.png)

---

⚡ This problem helps in practicing:
- Graph representation using adjacency matrix  
- Handling directed and undirected graphs  
- Efficient input and output for weighted graphs
