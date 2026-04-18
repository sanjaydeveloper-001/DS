# Binary Search Tree Operations in Java

This project implements basic operations on a **Binary Search Tree (BST)** using Java.

## Features

- **Insertion**: Add elements to the BST.
- **Search**: Check if an element exists in the BST.
- **Deletion**: Remove an element from the BST.
- **Display**: Print the tree structure with left and right children.

## How It Works

The program uses a simple CLI interface through standard input (Scanner) to accept user commands.

### Operations

- `1 <value>`: Insert a node with the given value into the BST.
- `2 <value>`: Search for the value in the BST. Returns `true` or `false`.
- `3 <value>`: Delete the value from the BST.
- `4`: Display the tree structure.

### Example Input

```
1 20
1 10
1 30
2 10
3 20
4
```

### Display Format

The display shows each node followed by its left (`L:`) and right (`R:`) children if they exist.

**Example Output**

```
10: R:30,
30:
```

## Classes

### `node`

Represents a node in the tree with:
- `int data` – the value stored
- `node left` – left child
- `node right` – right child

### `Main`

Implements the core BST logic:
- `ins()` – Insert
- `search()` – Search
- `del()` – Delete
- `dis()` – Display

## How to Run

Compile and run the Java file using any IDE or terminal:

```bash
javac Main.java
java Main
```

Then enter inputs as per the operations described above.

## Author

This program was implemented as part of a practice project on Binary Search Trees in Java.
