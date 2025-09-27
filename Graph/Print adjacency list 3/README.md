# Print Adjacency List 3

## Problem Statement -> [Image](https://s3.amazonaws.com/hr-assets/0/1722058293-7b9229db18-hc.png)
Given the number of edges **E** and vertices **V** of a **bidirectional graph**, build the graph using an adjacency list and print the adjacency list for each vertex.

---

## Input Format
1. The first line contains **T**, the number of test cases.
2. For each test case:
   - The first line contains two integers **V** and **E**, the number of vertices and edges.
   - The next **E** lines contain two integers each, representing an edge between the two vertices.

---

## Output Format
- For each vertex, print the connected nodes in the order they were added to the adjacency list.  
- Format: `vertex -> connected_node1 -> connected_node2 ...`

---

## Constraints
- 1 <= T <= 200  
- 1 <= V <= 10^3  
- 1 <= E <= V*(V-1)  

---

## Example

### Sample Input 0
```
2
5 7
0 1
0 4
1 2
1 3
1 4
2 3
3 4
3 3
0 1
1 2
2 0
```

### Sample Output 0
```
0-> 1-> 4
1-> 0-> 2-> 3-> 4
2-> 1-> 3
3-> 1-> 2-> 4
4-> 0-> 1-> 3
0-> 1-> 2
1-> 0-> 2
2-> 1-> 0
```

---

## Approach
1. **Initialize Graph:** Use a list of lists to store adjacency lists for each vertex.
2. **Read Input:** For each edge, update adjacency lists for both vertices (since the graph is bidirectional).
3. **Print Adjacency List:** Traverse each vertex's list and print in the required format.
4. **Multiple Test Cases:** Repeat the process for each test case.

**Steps in Detail:**  
- Create a list `adjList` of size `V` with empty lists.  
- For each edge `(u, v)`, append `v` to `adjList[u]` and `u` to `adjList[v]`.  
- For each vertex `i`, print `i` followed by all connected vertices using `->` as a separator.  

---

## Pseudocode
```
read T
for each test case:
    read V and E
    create adjList of size V with empty lists

    for i in range(E):
        read u, v
        adjList[u].append(v)
        adjList[v].append(u)

    for i in range(V):
        print i followed by all elements in adjList[i] separated by '->'
```

---

⚡ This problem helps in practicing:
- Graph representation using adjacency lists
- Handling multiple test cases efficiently
- Traversing and printing adjacency lists
