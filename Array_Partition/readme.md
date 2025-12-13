# Array Partition Program (Python)

## Description
This Python program reads an integer `n` and a list of `n` integers, then divides the elements into two separate lists (`a` and `b`) based on comparision rules.

The First element is added to list `a`, the second element is added to list `b`, and the remaining elements are distributed according to their values and the current lengths of the lists.

## How the Program Works
- The first element goes to list `a`
- The second element goes to list `b`
- Remaining elements:
    - If element < first element -> add to `a`
    - Else if element < second element -> add to `b`
    - Otherwise:
        - Add to the list with fewer elements
        - If both lists have equal length -> add to `a`
        - Otherwise -> add to `b`

## Input Format
- First line: an integer `n` (number of elements)
- Second line: `n` space-separated integers

## Output Format
- Prints list `a`
- Prints list `b`

## How to Run
Run the program using:
  ```bash
  python array_partition.py
