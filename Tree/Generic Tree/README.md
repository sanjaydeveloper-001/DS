# 🌳 Generic Tree - Sum of Nodes & Level Order Traversal

## 📌 Problem Statement

Given a **generic tree**, your task is to:

1. **Calculate the sum** of all nodes in the tree.
2. **Print the tree in Level Order Traversal**.

---

## 🧾 Input Format

* The input is given in **level order format**.
* Structure of input:

  ```
  root_data number_of_children child1 child2 ... childN ...
  ```
* For each node:

  * First comes the node value.
  * Then the number of children.
  * Followed by its children.

---

## 📤 Output Format

* First line: **Sum of all nodes**
* Second line: **Level order traversal**

---

## 🔍 Sample Input

```
10 3 20 30 40 2 40 50 0 0 0 0
```

---

## ✅ Sample Output

```
190
10 20 30 40 40 50
```

---

## 🧠 Approach

### 1. Tree Construction

* Use a **Queue** to build the tree level by level.
* Read:

  * Node value
  * Number of children
* Attach children to the current node.

---

### 2. Sum Calculation

* Use **Breadth-First Search (BFS)**.
* Traverse all nodes and accumulate their values.

---

### 3. Level Order Traversal

* Again use **Queue (BFS)**.
* Print nodes as they are visited.

---

## ⚙️ Code Explanation

### 🔹 Node Structure

```java
class Node{
    int d;
    List<Node> li;
}
```

* `d` → node value
* `li` → list of children

---

### 🔹 Sum Function

```java
public static int sum(Node root)
```

* Uses queue
* Traverses all nodes
* Adds values

---

### 🔹 Display Function

```java
public static void dis(Node root)
```

* Prints nodes in level order

---

### 🔹 Tree Construction (Main Logic)

```java
while(!que.isEmpty()){
    Node temp = que.poll();
    int size = sc.nextInt();
    while(size-- > 0){
        Node nn = new Node(sc.nextInt());
        temp.li.add(nn);
        que.add(nn);
    }
}
```

---

## ⏱️ Complexity Analysis

| Operation             | Time Complexity | Space Complexity |
| --------------------- | --------------- | ---------------- |
| Tree Construction     | O(N)            | O(N)             |
| Sum Calculation       | O(N)            | O(N)             |
| Level Order Traversal | O(N)            | O(N)             |

---

## 💡 Key Concepts Used

* Generic Tree
* Breadth-First Search (BFS)
* Queue
* Tree Traversal

---

## 🚀 How to Run

1. Copy the code into a Java file (`Solution.java`)
2. Compile:

   ```
   javac Solution.java
   ```
3. Run:

   ```
   java Solution
   ```
4. Provide input in the specified format

---

## Solution 

```
import java.io.*;
import java.util.*;

class Node{
    int d;
    List<Node> li;
    Node(int d){
        this.d = d;
        this.li = new ArrayList<>();
    }
}

public class Solution {
    
    public static int sum(Node root){
        if(root == null) return 0;
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        
        int sum = 0;
        sum += root.d;
        while(!que.isEmpty()){
            Node temp = que.poll();
            for(Node i: temp.li){
                sum += i.d;
                que.add(i);
            }   
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Node> que = new LinkedList<>();
        Node root = new Node(sc.nextInt());
        que.add(root);
        
        while(!que.isEmpty()){
            Node temp = que.poll();
            int size = sc.nextInt();
            while(size-- > 0){
                Node nn = new Node(sc.nextInt());
                temp.li.add(nn);
                que.add(nn);
            }
        }
        System.out.println(sum(root));
        dis(root);
    }
    
    public static void dis(Node root){
        if(root == null) return;
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        System.out.print(root.d+" ");
        while(!que.isEmpty()){
            Node temp = que.poll();
            for(Node i: temp.li){
                System.out.print(i.d+" ");
                que.add(i);
            }   
        }
    }
    
    
}
```

## 🏁 Summary

* Built a **generic tree** using level order input
* Used **BFS** to:

  * Compute sum
  * Print traversal
* Efficient and clean solution with **O(N)** complexity

---
