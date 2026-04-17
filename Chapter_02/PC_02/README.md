# 2, Name and Initials

## Problem Statement
Write a program that has the following `String` variables: `firstName`, `middleName`, 
and `lastName`. Initialize these with your first, middle, and last names. The program 
should also have the following `char` variables: `firstInitial`, `middleInitial`, and 
`lastInitial`. Store your first, middle, and last initials in these variables. The 
program should display the contents of these variables on the screen.

## Solution Overview
This program demonstrates the difference between `String` (a reference type used for 
sequences of characters) and `char` (a primitive type that holds a single character) 
in Java. The variables are declared, initialized with literal values, and printed to 
the console using `System.out.println()`.

**Note:** Since I do not have a middle name, the `middleName` and `middleInitial` 
variables were intentionally omitted rather than initialized to placeholder values. 
In Java, primitive types like `char` cannot be assigned `null`, so leaving them out 
keeps the program clean and accurate.

## Files
- `Initials.java` — Source file containing the `Initials` class with the `main` method.

## How to Compile & Run
```bash
# Compile
javac Initials.java

# Run
java Initials
```

## Sample Output

-------------- Name and Initials --------------
First Name: Yasin
Last name: Zahir
First Initial: Y
Last initial: Z
-------------- Name and Initials --------------


## Concepts Practiced
- Variable declaration and initialization
- The `String` reference type vs. the `char` primitive type
- Character literals using single quotes (`'Y'`) vs. string literals using double quotes (`"Yasin"`)
- String concatenation with the `+` operator
- Console output with `System.out.println()`

## Disclaimer
This README was generated with the assistance of AI.
All code solutions are written by me, Yasin Zahir.