# 🌳 Count the Number of Nodes in a Binary Tree

## 📌 Problem Statement
You are given the level-order traversal of a **binary tree** where `-1` indicates the absence of a child node.  
Your task is to **count the total number of nodes present** in the binary tree.

---

## 📥 Input Format
- A single line containing integers separated by spaces.  
- `-1` represents a `null` (no child).

### Constraints
- `1 <= N <= 10^6` (where N is the total number of nodes in the binary tree, excluding `-1` values).
- Time Limit: `1 second`.

---

## 📤 Output Format
- Print the **total number of nodes** in the binary tree.

---

## ✅ Sample Input
```
1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
```

## 🎯 Sample Output
```
7
```

---

## 💡 Approach
1. Read the input and construct the binary tree using a **queue** (level-order creation).
2. Ignore `-1` values (they represent missing nodes).
3. Perform a recursive count of nodes:
   - Base Case: If the node is `null`, return 0.
   - Recursive Case: Return `1 + count(left subtree) + count(right subtree)`.
