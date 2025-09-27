# Kosakosa Linked List

## Problem Statement

Write a program to create a linked list by **appending the elements
without duplicates** and then:\
1. Print the resultant linked list.\
2. Print the **mid element** of the linked list.

------------------------------------------------------------------------

## Input Format

-   A single line of space-separated integers representing the elements
    of the linked list.

------------------------------------------------------------------------

## Output Format

-   First line: The final linked list (with duplicates removed,
    preserving insertion order).\
-   Second line: The mid element of the linked list.

> If the linked list has an **even number of elements**, print the
> **(n/2 + 1)-th element** (i.e., the second middle).

------------------------------------------------------------------------

## Examples

### Sample Input 0

    1 2 3 4

### Sample Output 0

    1 2 3 4
    3

------------------------------------------------------------------------

### Sample Input 1

    1 2 3 4 5

### Sample Output 1

    1 2 3 4 5
    3

------------------------------------------------------------------------

## Explanation

1.  For input `1 2 3 4`, the linked list is created as `1 → 2 → 3 → 4`.
    -   The middle index = `4 / 2 = 2`, so the **3rd element = 3** is
        printed.
2.  For input `1 2 3 4 5`, the linked list is created as
    `1 → 2 → 3 → 4 → 5`.
    -   The middle index = `(5 // 2) + 1 = 3`, so the **3rd element =
        3** is printed.

------------------------------------------------------------------------

## Constraints

-   Elements are integers.\
-   Size of input ≤ 1000.

------------------------------------------------------------------------

## Approach

1.  Parse the input and remove duplicates while preserving order.\
2.  Build a linked list with the unique elements.\
3.  Traverse the linked list to:
    -   Print all elements.\
    -   Find the middle element using either:
        -   **Two-pointer technique** (fast & slow pointers).\
        -   Or compute length and access the middle index.

------------------------------------------------------------------------

## Sample Pseudocode

``` text
read input list
remove duplicates (preserve order)
build linked list

print linked list elements

find middle:
    use two-pointer method OR
    calculate length and take (length // 2)-th element
print mid element
```

------------------------------------------------------------------------

⚡ This problem helps in practicing:\
- Linked list creation\
- Duplicate removal while preserving order\
- Finding the middle element efficiently
