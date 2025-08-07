**The Magical Ledger**


In the kingdom of Arithmora, there's an ancient ledger that records the number of magical stones collected by the villagers during the Spring Festival. Each villager writes down the type of stone they collected using a specific number as an identifier (e.g., 1 for Ruby, 2 for Sapphire, etc.).

The wise Sage Numeron is responsible for analyzing the ledger to find out how many times each type of stone was collected. However, he needs your help to do it efficiently.

You are given a list of numbers from the ledger. Each number represents a type of magical stone. Your task is to count how many times each stone type appears and report it to Sage Numeron in ascending order of the stone types.

Input Format

The first line contains a single integer n (4 ≤ n ≤ 20), representing the number of elements in the array.

The second line contains n space-separated integers.

9
2 1 3 2 2 5 8 9 8

Constraints

4 ≤ n ≤ 20
-100 ≤ array[i] ≤ 100

Output Format

For each unique stone type, print the stone number, followed by a hyphen (-), then the count of how many times it appeared.

Output should be sorted by the stone number in ascending order.
1 - 1
2 - 3
3 - 1
5 - 1
8 - 2
9 - 1

Sample Input 0

9
2 1 3 2 2 5 8 9 8


Sample Output 0

1 - 1
2 - 3
3 - 1
5 - 1
8 - 2
9 - 1

