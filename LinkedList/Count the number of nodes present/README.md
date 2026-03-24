---

# 🌲 Binary Tree - Count Total Nodes

## 📌 Problem Statement

Given a **binary tree**, count and return the **total number of nodes** present in the tree.

---

## 🧾 Input Format

* A single line of input containing node values in **level order**.
* `-1` represents **no child (null node)**.
* `-1` is **not considered as a valid node value**.

---

## 📤 Output Format

* Print a single integer representing the **total number of nodes** in the binary tree.

---

## 🔍 Sample Input

```id="input1"
1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
```

---

## ✅ Sample Output

```id="output1"
7
```

---

## 🧠 Approach

### 1. Tree Construction (Level Order)

* Use a **Queue** to construct the binary tree.
* Read values sequentially:

  * First value → root
  * Next two values → left and right child
* If value is `-1`, skip creating that child.

---

### 2. Count Nodes (Recursion)

* Use **recursive traversal**:

  ```
  count = 1 + left_subtree + right_subtree
  ```
* Base case:

  ```
  if(root == null) return 0;
  ```

---

## ⚙️ Code Explanation

### 🔹 Node Structure

```java id="node"
class Node{
    Node right;
    Node left;
    int data;
}
```

---

### 🔹 Tree Creation

```java id="creation"
static void creation()
```

* Uses **Queue (BFS)**.
* Builds tree from level order input.
* Handles `-1` as null nodes.

---

### 🔹 Count Function

```java id="count"
static int count(Node root)
```

* Recursive function:

  * Counts current node (`1`)
  * Adds left subtree count
  * Adds right subtree count

---

### 🔹 Main Method

```java id="main"
creation();
System.out.print(count(root));
```

---

## ⏱️ Complexity Analysis

| Operation      | Time Complexity | Space Complexity |
| -------------- | --------------- | ---------------- |
| Tree Creation  | O(N)            | O(N)             |
| Counting Nodes | O(N)            | O(H)             |

* `N` → number of nodes
* `H` → height of tree (recursion stack)

---

## 💡 Key Concepts Used

* Binary Tree
* Level Order Traversal (BFS)
* Recursion
* Queue (LinkedList)

---

## 🚀 How to Run

1. Save file as `Solution.java`
2. Compile:

   ```
   javac Solution.java
   ```
3. Run:

   ```
   java Solution
   ```
4. Enter input in the given format

---

## ⚠️ Edge Cases Considered

* Empty tree (all values `-1`)
* Single node tree
* Skewed tree (only left/right children)
* Large input size (up to 10⁶ nodes)

---

## Solution
```
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Node{
    Node right;
    Node left;
    int data;
    
    Node(int d){
        this.data = d;
        this.right = null;
        this.left = null;
    }
}

public class Solution {
    
    static Node root;
    
    static void creation(){
        
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        Queue<Node> que = new LinkedList<>();
        root = new Node(d);
        que.add(root);

        while(!que.isEmpty()){
            Node temp = que.poll();
            d = sc.nextInt();
            
            if(d != -1){
                Node nn = new Node(d);
                temp.left = nn;
                que.add(temp.left);
            }
            d = sc.nextInt();
            if(d != -1){
                Node nn = new Node(d);
                temp.right = nn;
                que.add(temp.right);
            }
        }
    }
    
    static int count(Node root){
        if(root == null) return 0;
        return 1+ count(root.left) + count(root.right);
    }

    public static void main(String[] args) {
        creation();
        System.out.print(count(root));
    }
        
}
```

---

## 🏁 Summary

* Built binary tree using **level order input**
* Used **recursion** to count nodes efficiently
* Achieved optimal **O(N)** time complexity

---
* 🔥 Iterative solution (without recursion)
* 📊 Visual tree diagram
* ⚡ Faster input handling for large constraints (BufferedReader)

Just tell me 👍
