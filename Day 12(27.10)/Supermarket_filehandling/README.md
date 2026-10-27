# Day 12 – Supermarket Task Using File Handling

## Overview
This project implements a menu-driven supermarket billing system using Java. Customers can select products from different categories, enter quantities, and calculate their shopping bill. The program displays the final bill and saves the shopping session details to a separate text file using Java file handling.

## Features
- Displays four product categories: Vegetables, Fruits, Dairy Products, and Snacks.
- Lists predefined products, prices, and measurement units.
- Accepts product selections and quantities from the user.
- Calculates individual item totals and the running grand total.
- Validates category choices, item choices, and quantities.
- Creates a separate text file for each shopping session.
- Records purchased items, categories, prices, quantities, and subtotals.
- Appends each purchase and the final bill to the same session file.
- Displays the final bill and the saved file location.
- Handles file-writing errors using exception handling.

## Key Java Concepts Used

### 1. Arrays
One-dimensional arrays store category names and measurement units. Two-dimensional arrays store product names and prices for each category.

### 2. Scanner
The `Scanner` class reads category selections, item choices, and quantities entered by the user.

### 3. Loops and Conditional Statements
`while` loops repeatedly display menus and support continued shopping. `for` loops display categories and products. `if` statements validate selections, while `break` and `continue` control program flow.

### 4. Arithmetic Operations
The item amount is calculated by multiplying the product price by its quantity. Each item amount is added to the grand total.

### 5. File Creation
`File.createTempFile()` creates a uniquely named text file for each shopping session in the current working directory.

### 6. File Writing
`FileWriter` opens the bill file for writing. Append mode, enabled using `new FileWriter(billFile, true)`, adds new information without overwriting previously recorded purchases.

### 7. PrintWriter
`PrintWriter` writes product details, quantities, prices, subtotals, and formatted monetary values to the text file.

### 8. Exception Handling
`try-catch` blocks handle `IOException` errors that may occur during file creation or writing.

### 9. Try-with-Resources
The try-with-resources statement automatically closes the `PrintWriter` after each file-writing operation, helping prevent resource leaks.

## How to Execute
Compile the program using `javac Supermarket.java` and run it using `java Supermarket`. Select products, enter quantities, and choose option 5 to finish shopping. The program displays the final bill and saves the complete shopping session in a uniquely named text file.

## Conclusion
This project demonstrates practical applications of Java arrays, loops, conditional statements, arithmetic operations, user input, file creation, file writing, append mode, and exception handling. It combines a menu-driven shopping experience with persistent bill records using text-file storage.
