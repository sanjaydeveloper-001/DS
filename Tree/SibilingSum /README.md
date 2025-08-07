# Single Child Nodes in Binary Tree

## Problem Statement

Given a binary tree where `-1` represents a null child in the input, your task is to construct the binary tree and print all the nodes that have **only one child** (i.e., either left or right child, but not both).

## Input Format

The input represents the level order traversal of the binary tree:
- Each node is followed by two integers representing its left and right children.
- A value of `-1` indicates a null child.

### Example Input:
1 2 3 4 -1 -1 5 -1 -1 -1 -1

This represents the following tree:

     1
    / \
   2   3
  /     \
 4       5


## Output Format

Print the data values of nodes that have exactly one child (left or right but not both).

### Example Output:
4 5

## Approach

1. **Build the Tree**: The tree is built using a level-order approach.
   - A queue is used to keep track of the nodes.
   - For each node dequeued, read two integers for its left and right children.
   - If a child is not `-1`, create the corresponding node and link it.

2. **Find Nodes with Single Child**:
   - Traverse the tree recursively.
   - For each node, check if it has either a left child or right child (but not both).
   - If it satisfies the condition, print that child’s data.

## Code Highlights

- The `node` class is used to define the binary tree node structure.
- `BT()` is the function used to construct the binary tree from input.
- `sib(node)` is the recursive function to find and print nodes with only one child.

## Usage

Run the program and input space-separated integers representing the tree.
The output will be the node values that have only one child.
"""
