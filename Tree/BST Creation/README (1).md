# Binary Search Tree (BST) - Java Implementation

This project implements a **Binary Search Tree (BST)** in Java. It allows insertion of nodes and displays the BST structure in a readable format.

## Features

- Insert nodes into a BST using recursion
- Display the structure of the BST in a clear and hierarchical format

## How it Works

1. **Insertion (`ins` function):**
   - Recursively inserts a node based on BST properties.
   - If the value is smaller than the current node, it goes to the left.
   - Otherwise, it goes to the right.

2. **Display (`dis` function):**
   - Recursively prints each node and its left and right child (if any).

## Sample Output

```
Enter the number of nodes :
5
Enter Node 1:
10
Enter Node 2:
5
Enter Node 3:
20
Enter Node 4:
3
Enter Node 5:
7
BST :
10: L:5, R:20,
5: L:3, R:7,
3:
7:
20:
```

## How to Run

1. Copy the code into a file named `Main.java`.
2. Compile using: `javac Main.java`
3. Run using: `java Main`