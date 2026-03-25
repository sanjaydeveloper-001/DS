# ➕ Add 1 to a Linked List Number

## 📌 Problem Statement

You are given a linked list where each node contains a single digit (0–9).
The linked list represents a number formed by concatenating all node values.

Your task is to **add 1** to this number and return the updated linked list.

---

## 🧠 Examples

### Example 1

```
Input:  4 -> 5 -> 6
Output: 4 -> 5 -> 7
Explanation: 456 + 1 = 457
```

### Example 2

```
Input:  1 -> 2 -> 3
Output: 1 -> 2 -> 4
Explanation: 123 + 1 = 124
```

---

## ⚙️ Constraints

* `1 <= length of list <= 10^5`
* `0 <= node value <= 9`

---

## 🚀 Approach

### 🔍 Key Idea

Instead of reversing the linked list or converting it to a number:

* Traverse the list and **find the last node which is NOT 9**
* Increment that node
* Set all nodes after it to `0`

---

### 💡 Why this works?

* Adding 1 only affects trailing 9s
* Example:

  ```
  1 -> 2 -> 9 -> 9
         ↑
  Last non-9 node
  ```

  After increment:

  ```
  1 -> 3 -> 0 -> 0
  ```

---

### ⚠️ Edge Case

If all digits are `9`:

```
9 -> 9 -> 9  →  1 -> 0 -> 0 -> 0
```

We create a new head node.

---

## ⏱️ Complexity Analysis

| Type  | Complexity |
| ----- | ---------- |
| Time  | **O(n)**   |
| Space | **O(1)**   |

---

## 🏆 Key Highlights

* No reversal needed ❌
* No extra space used ✅
* Efficient single traversal ✔️
* Handles edge cases (all 9s) ✔️

---

## 📚 Tags

* Linked List
* Simulation
* Greedy

---
