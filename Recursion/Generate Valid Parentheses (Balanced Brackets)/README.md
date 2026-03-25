# 🔁 Generate Valid Parentheses (Balanced Brackets)

## 📌 Problem Statement

Given an integer `N`, generate **all possible combinations of N pairs of parentheses** such that they are **valid (balanced)**.

A valid parentheses string must:

* Open before it closes
* Never have more closing brackets than opening ones at any point

---

## 🧠 Example

### Input

```
N = 4
```

### Output

```
(((())))
((()()))
((())())
((()))()
(()(()))
(()()())
(()())()
(())(())
(())()()
()((()))
()(()())
()(())()
()()(())
()()()()
```

---

## 🚀 Approach (Backtracking)

We build the string step by step using recursion:

### 🔑 Rules:

* We can add `'('` **if** count of `'('` < N
* We can add `')'` **if**:

  * count of `')'` < N
  * AND `')'` count is less than `'('` count

---

### ❗ Important Condition

```java
if(c2 < N && c2 < c1)
```

### 💡 Why is `c2 < c1` important?

Without this condition:

* You generate **invalid sequences** like:

  ```
  )()()(
  (()))(
  ```

With this condition:

* You ensure **balance is maintained**
* At any point:

  ```
  closing brackets ≤ opening brackets
  ```

👉 This is the key to generating only **valid parentheses combinations**

---

## 🧾 Code (Java)

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recur("", 0, 0, n);
    }

    public static void recur(String s, int c1, int c2, int N){
        // Base case
        if(s.length() == N + N){
            System.out.println(s);
            return; 
        }                  

        // Add opening bracket
        if(c1 < N) 
            recur(s + '(', c1 + 1, c2, N);

        // Add closing bracket (only if valid)
        if(c2 < N && c2 < c1) 
            recur(s + ')', c1, c2 + 1, N);
    }
}
```

---

## ⏱️ Complexity Analysis

| Type  | Complexity                                      |
| ----- | ----------------------------------------------- |
| Time  | **O(2ⁿ)** (Valid combinations ≈ Catalan Number) |
| Space | **O(N)** (Recursion stack)                      |

---

## 🏆 Key Concepts

* Backtracking
* Recursion
* Constraint-based generation
* Catalan Numbers (number of valid combinations)

---

## 📚 Insight

Total valid combinations for `N` pairs:

```
Catalan(N) = (2N)! / ((N+1)! * N!)
```

---

## 🔥 Key Takeaway

👉 The condition `c2 < c1` is what filters:

* ❌ All possibilities → invalid + valid
* ✅ Only valid (balanced) parentheses

---  
