## 🧙‍♂️ The Magical Ledger

### 📖 Story

In the kingdom of **Arithmora**, there's an ancient ledger that records the number of magical stones collected by the villagers during the Spring Festival. Each villager writes down the type of stone they collected using a specific number as an identifier (e.g., 1 for Ruby, 2 for Sapphire, etc.).

The wise Sage Numeron is responsible for analyzing the ledger to find out how many times each type of stone was collected. However, he needs your help to do it efficiently.

---

### 🧾 Input Format

- The first line contains a single integer `n` (4 ≤ n ≤ 20), representing the number of elements in the array.
- The second line contains `n` space-separated integers.

```
9 2 1 3 2 2 5 8 9 8
```

---

### 📏 Constraints

- 4 ≤ n ≤ 20  
- -100 ≤ array[i] ≤ 100

---

### 🖨️ Output Format

For each unique stone type, print the stone number, followed by a hyphen (`-`), then the count of how many times it appeared.

Output should be sorted by the stone number in ascending order.

```
1 - 1
2 - 3
3 - 1
5 - 1
8 - 2
9 - 1
```

---

### 🧠 Method / Approach

1. Read the size of the array and the array elements.
2. Find the minimum and maximum values from the array.
3. Adjust the minimum value to zero if it's positive, to ensure indexing works for all integers.
4. Create a frequency array of size `(abs(min) + max + 1)` to accommodate negative and positive numbers.
5. For each element in the array, increment the frequency at its shifted index.
6. Finally, traverse the frequency array and print the values that have a count greater than zero, adjusting the index back to the original number.

---

### 📝 Notes

- This method handles both negative and positive numbers efficiently by mapping the actual values to valid frequency array indices using shifting.
- Ensures the output is always sorted in ascending order of stone types.