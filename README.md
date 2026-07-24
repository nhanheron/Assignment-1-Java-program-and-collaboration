# Grocery Management System

**CS 3354 — Object Oriented Programming (Summer 2026)**
**Assignment 1: Java Program and Collaboration**

## Group Members

- Noah Pham
- Kelly Jenkins

## Overview

A console grocery management system built on **parallel arrays**. Three arrays of
length 10 hold the inventory, and the same index refers to the same item in all
three:

```java
String[] itemNames  = new String[10];
double[] itemPrices = new double[10];
int[]    itemStocks = new int[10];
```

So `itemNames[2]`, `itemPrices[2]`, and `itemStocks[2]` together describe one
grocery item. A slot whose name is `null` is treated as empty and is skipped
when the inventory is printed.

## Tasks

| Task | Branch | What it does |
| --- | --- | --- |
| 1. Inventory Display | `feature-display` | `printInventory` loops the arrays and prints only the non-empty slots |
| 2. Restock & Search | `feature-restock` | `restockItem` searches by name and adds to that item's stock |
| 3. User Menu | `feature-menu` | `main` runs a `Scanner` + `while(true)` menu that calls the two methods above |

### Task 1 — `printInventory`

```java
public static void printInventory(String[] names, double[] prices, int[] stocks)
```

Uses a `for` loop over the arrays with an `if` check on `names[i] != null`, so
unused slots are never printed. Each item prints its name, price, and stock.

### Task 2 — `restockItem`

```java
public static void restockItem(String[] names, int[] stocks, String target, int amount)
```

Loops through `names` looking for `target` (case-insensitive). On a match it
adds `amount` to `stocks` at that same index and prints the new total. If the
loop finishes without a match, it prints `Item not found.`

### Task 3 — The Menu

`main` creates the three arrays, seeds them with four starting items (Milk,
Bread, Eggs, Apples), and then loops forever on a menu:

- `1` — View inventory
- `2` — Restock an item (prompts for the name and the amount)
- `3` — Exit

Anything else prints an error and re-shows the menu. Non-numeric input is
handled too, so a stray letter will not crash the program.

## Project Structure

```
cs-3354-assignment-01/
├── GroceryManagement.java   # the whole program: main + both methods
├── README.md
└── docs/                    # generated Javadoc (open docs/index.html)
```

## How to Compile and Run

From inside the `cs-3354-assignment-01` folder:

```bash
javac GroceryManagement.java
java GroceryManagement
```

## Sample Run

```
===== Grocery Management Menu =====
1. View Inventory
2. Restock Item
3. Exit
Enter your choice: 1

----- Current Inventory -----
Milk       $2.99   Stock: 10
Bread      $1.99   Stock: 5
Eggs       $3.49   Stock: 8
Apples     $0.99   Stock: 24

===== Grocery Management Menu =====
1. View Inventory
2. Restock Item
3. Exit
Enter your choice: 2
Enter the item name to restock: Milk
Enter the amount to add: 5
Restocked Milk. New stock: 15

===== Grocery Management Menu =====
1. View Inventory
2. Restock Item
3. Exit
Enter your choice: 2
Enter the item name to restock: Kale
Enter the amount to add: 3
Item not found.

===== Grocery Management Menu =====
1. View Inventory
2. Restock Item
3. Exit
Enter your choice: 3
Goodbye!
```

## Documentation

The class and every method carry Javadoc comments. The generated HTML lives in
`docs/` — open `docs/index.html` in a browser.

To regenerate it:

```bash
javadoc -d docs -author -version GroceryManagement.java
```

## Git Workflow

Each member worked on a feature branch and merged it into `main`:

```bash
git checkout -b feature-display    # Task 1
git checkout -b feature-restock    # Task 2
git checkout -b feature-menu       # Task 3
```

Each branch was committed, pushed, and then merged into `main`.

## Grading

Grader `nikolas-AI` has been added as a collaborator on this repository.
