# Count the Number of Nodes in a Binary Tree

## Problem Statement

Given a binary tree, count the **total number of nodes** present.

-   The first and only line of input will contain the node data, all
    separated by a single space.\
-   `-1` is used to indicate whether the left or right child exists and
    **should not be counted as node data**.

------------------------------------------------------------------------

## Input Format

-   A single line containing node data separated by spaces.\
-   Constraints: 1 \<= N \<= 10\^6, where **N** is the total number of
    nodes.\
-   Time Limit: 1 second.

------------------------------------------------------------------------

## Output Format

-   A single line printing the **number of nodes** in the binary tree.

------------------------------------------------------------------------

## Example

### Sample Input 0

    1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1

### Sample Output 0

    7

------------------------------------------------------------------------

## Explanation

-   The input represents the binary tree:\

```{=html}
<!-- -->
```
            1
          /        2     3
        / \   /    4   5 6   7

-   Total nodes = 7

------------------------------------------------------------------------

## Approach

1.  Parse the input and construct the binary tree.\
2.  Traverse the tree using any traversal method (preorder, inorder,
    postorder, or level-order).\
3.  Count the nodes while traversing.\
4.  Print the count.

------------------------------------------------------------------------

## Pseudocode

``` text
read input list until -1
create binary tree

initialize count = 0
traverse tree:
    for each node, increment count

print count
```

------------------------------------------------------------------------

⚡ This problem helps in practicing:\
- Binary tree construction\
- Tree traversal\
- Counting nodes efficiently in large input size
