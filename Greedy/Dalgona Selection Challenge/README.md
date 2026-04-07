---

# 🍬 Dalgona Selection Challenge

## 📌 Problem Overview

In the mysterious survival game inspired by *Squid Game*, players face the **Dalgona Selection Game**.

You are given **N dalgona candies** arranged in a line. Each candy has a **shape type** represented by an integer.

### 🎯 Goal

Choose a **single shape type** such that:

* You collect **maximum number of candies**
* You **cannot pick adjacent candies**

If multiple shape types give the same maximum count, return the **smallest shape number**.

---

## 🧠 Approach

1. Traverse the array of candies.
2. If two adjacent candies are of the same type:

   * Ignore the current one (set it to 0 or skip it).
3. Use a **HashMap** to count valid occurrences of each shape.
4. Find the shape with:

   * Maximum count
   * If tie → smallest shape number

---

## 💡 Key Idea

This problem is similar to selecting **non-adjacent elements of the same value** while maximizing frequency.

---

## 📥 Input Format

```
N
A1 A2 A3 ... AN
```

* `N` → Number of candies
* `Ai` → Shape type of each candy

---

## 📤 Output Format

```
Single integer representing the optimal shape type
```

---

## 🔒 Constraints

* `1 ≤ N ≤ 1000`
* `1 ≤ Ai ≤ 1000`

---

## 🧪 Sample Test Cases

### Input

```
5
1 2 2 1 2
```

### Output

```
1
```

---

### Input

```
6
1 1 1 1 1 1
```

### Output

```
1
```

---

### Input

```
5
1 2 3 4 5
```

### Output

```
1
```

---

### Input

```
7
6 7 6 7 6 7 6
```

### Output

```
6
```

---

## 🛠️ Implementation (Java)

```java
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        
        Map<Integer, Integer> map = new HashMap<>();
        map.put(arr[0], 1);

        for(int i=1; i<n; i++){
            if(arr[i] == arr[i-1]) arr[i] = 0;
            else {
                if(map.containsKey(arr[i]))
                    map.put(arr[i], map.get(arr[i])+1);
                else
                    map.put(arr[i], 1);
            }
        }

        int max = 0;
        int result = Integer.MAX_VALUE;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            if(value > max || (value == max && key < result)){
                max = value;
                result = key;
            }
        }

        System.out.print(result);
    }
}
```

---

## 🚀 Features

* Efficient solution using **HashMap**
* Handles edge cases (all same / all different)
* Optimized for given constraints

---
