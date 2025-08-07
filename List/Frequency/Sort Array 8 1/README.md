## 🔢 Sort Array by Frequency – 8.1

### 📌 Problem Statement

Sort the array elements in **descending order** according to their **frequency of occurrence**.

---

### 🧾 Input Format
```
11 2 2 3 4 5 12 2 3 3 3 12
```

---

### 📏 Constraints
- 5 ≤ n ≤ 20  
- -100 ≤ a[i] ≤ 100

---

### 🖨️ Output Format
```
3 3 3 3 2 2 2 12 12 4 5
```

---

### 📘 Sample Input 0
```
10 3 3 2 2 2 5 5 5 8 7
```

### 📗 Sample Output 0
```
2 2 2 5 5 5 3 3 7 8
```

---

### 🧠 Method / Approach

1. Count the **frequency** of each element in the array.
2. Use a `while (true)` **infinite loop** to:
   - Traverse the frequency array and find the element with the **maximum frequency** and its **index**.
   - Print that element as many times as its frequency.
   - Mark that frequency as zero to avoid printing again.
3. Repeat the process until all frequencies are printed.

---

### 🛠️ Notes

- Frequency ties are resolved by **order of appearance**.
- This is a basic algorithm-based sorting problem using custom frequency logic.