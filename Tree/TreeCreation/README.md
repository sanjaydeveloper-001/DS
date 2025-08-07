# Binary Tree Creation and Level Order Traversal

## Problem Statement

This program constructs a binary tree from user input and then displays its nodes in level order (breadth-first traversal).

## How It Works

- The tree is created level-wise based on the input.
- For each node, the user inputs two values: the left child and right child.
- If a child does not exist, the user inputs `-1`.
- After the tree is constructed, the program prints the nodes in level order.

## Input Format

- First, input the root node value.
- Then for each node, input two integers representing the left and right child values respectively.
- Use `-1` to indicate no child for that position.

### Example

1
2 3
-1 -1
-1 -1

This creates a tree:
1
/
2 3

## Output Format

- The output is the level order traversal of the constructed tree.
- Nodes are printed separated by spaces.

### Example Output

1 2 3

## Method / Approach

1. **Node class:** Defines the structure of a tree node with `data`, `left`, and `right` pointers.
2. **Tree creation:** 
   - Starts by reading the root node.
   - Uses a queue to keep track of nodes whose children need to be assigned.
   - For each node, reads left and right child values.
   - If the value is not `-1`, creates a new node and links it accordingly.
3. **Level order traversal:**
   - Uses a queue to visit nodes in breadth-first order.
   - Prints node data as nodes are dequeued.
4. **Input ends** when all nodes have their children assigned (`-1` indicates no child).

## Constraints

- Input must be integers.
- Use `-1` to mark absence of a child node.
