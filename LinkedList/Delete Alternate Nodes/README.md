# Delete Alternate Nodes 1

## Problem Statement

Given a Singly Linked List of integers, delete all the **alternate
nodes** in the list.

-   Example:
    -   Input List: `10 -> 20 -> 30 -> 40 -> 50 -> 60 -> null`\
    -   Alternate nodes: `20, 40, 60`\
    -   After deletion: `10 -> 30 -> 50 -> null`

------------------------------------------------------------------------

## Input Format

-   A single line containing the elements of the Singly Linked List
    separated by spaces.\
-   The list is terminated by **`-1`**, which should not be considered
    as part of the list.

------------------------------------------------------------------------

## Output Format

-   A single line containing the updated linked list elements (after
    deleting alternate nodes).

------------------------------------------------------------------------

## Constraints

-   ( 1 \<= N \<= 10\^6 ), where **N** is the size of the linked list.\
-   Time Limit: **1 second**

------------------------------------------------------------------------

## Example

### Sample Input 0

    10 20 30 40 50 60 70 -1

### Sample Output 0

    10 30 50 70

------------------------------------------------------------------------

## Explanation

-   Input List: `10 -> 20 -> 30 -> 40 -> 50 -> 60 -> 70 -> null`\
-   Delete alternate nodes (`20, 40, 60`)\
-   Remaining list: `10 -> 30 -> 50 -> 70`

------------------------------------------------------------------------

## Approach

1.  Read the input and construct the linked list.\
2.  Traverse the list and skip every second node.\
3.  Print the updated linked list.

------------------------------------------------------------------------

## Pseudocode

``` text
read input list until -1
create linked list

set current = head
while current != null and current.next != null:
    current.next = current.next.next
    move current = current.next

print updated list
```

------------------------------------------------------------------------

⚡ This problem helps in practicing:\
- Linked list traversal\
- Node deletion\
- Efficient handling of large input size
