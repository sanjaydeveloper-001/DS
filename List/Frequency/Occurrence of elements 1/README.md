## 🔁 Occurrence of Elements – 1

### 📌 Problem Statement

Find the occurrence of each number from the input array and display the frequencies in the **order of ascending input values**.

---

### 🧾 Input Format

- The first line contains a single integer `n` (6 ≤ n ≤ 12), representing the number of elements in the array.
- The second line contains `n` space-separated integers.

#### Example:
9
3 4 3 4 1 2 3 1 2

---


### 📏 Constraints

- 6 ≤ n ≤ 12  
- 1 ≤ array[i] ≤ 100

---


### 🖨️ Output Format

Print the count (frequency) of each number in the array, in the **ascending order** of the input values.

#### Example Output:
2 2 3 2

---

### 🧠 Method / Approach

1. **Read the input size and array elements.**
2. **Find the maximum value** in the array. This helps to create a frequency array with sufficient size.
3. **Initialize a frequency array** of size `max + 1` with all values set to zero.
4. Traverse the input array:
   - For each element, increment the corresponding index in the frequency array.
5. Finally, iterate over the frequency array from index `0` to `max`:
   - If the frequency is not zero, print it. This ensures values are displayed in order of increasing element value.

This method uses an efficient array-based frequency counting mechanism that leverages direct indexing, avoiding nested loops.

---

### 📝 Notes

- This method guarantees **O(n)** time complexity for counting.
- The final output respects **ascending order** due to the way the frequency array is traversed.
"""

