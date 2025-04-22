# Assignment: Exploring Java Concepts

The following project contains all
five parts of the "Exploring Java Concepts"
assignment, each of which is implemented
in a separate class with the format
"Part _[number]_ " (e.g. "Part1" for part 1).
Here are the tasks implemented for each part:

## `Part1`: Exploring Variables and Primitive Types
### 1. Declare and Initialize Variables
* Declare an **integer** variable `age` and initialize it with my age.
* Declare a **double** variable `height` and initialize it with my height in inches.
* Declare a **char** variable `initial` and initialize it with the first letter of my name.
* Declare a **boolean** variable `isStudent` and initialize it to `true` or `false` based on my student status.
### 2. Print Variable Values
* Print the values of all the variables you declared and initialized.

## `Part2`: Increment and Decrement Operations
### 1. Declare and Initialize Variables
* Declare an **integer** variable `counter` and initialize it with the value `10`.
### 2. Perform Increment and Decrement Operations:
* Increment the value of `counter` by `1` using the increment operator (`++`).
* Print the value of `counter`.
* Decrement the value of `counter` by `1` using the decrement operator (`--`).
* Print the value of `counter`.
### 3. Use Increment and Decrement in Loops
* Use a `for` loop to increment `counter` from `10` to `15` and print each value.
* Use a `while` loop to decrement `counter` from `15` to `10` and print each value.

## `Part3`: Working with Strings and User Input
### 1. Import the `Scanner` Class
* Import the `Scanner` class from the `java.util` package.
### 2. Read User Input
* Create a `Scanner` object to read user input.
* Prompt the user to enter their first name and store it in a `String` variable `firstName`.
* Prompt the user to enter their last name and store it in a `String` variable `lastName`.
### 3. Manipulate Strings
* Concatenate `firstName` and `lastName` to form the full name and store it in a `String` variable `fullName`.
* Convert `fullName` to uppercase and store it in a new variable.
* Count the number of times the first character of `fullName` appears throughout the string.
* Print the full name, its uppercase version, and the number of times the first letter appears.

## `Part4`: Using Conditionals, Logical Operators, and Switch Statements
### 1. Declare and Initialize Variables
* Declare three **integer** variables representing test scores and initialize them with a value between `0` and `100`.
* Declare an **integer** variable `averageScore` and initialize it to the average of the three test scores.
### 2. Use Conditionals and Logical Operators
* Use `if-else` statements to print a message based on the `averageScore`:
  * "Excellent" if `averageScore` is between `90` and `100`.
  * "Good" if `averageScore` is between `70` and `89`.
  * "Average" if `averageScore` is between `50` and `69`.
  * "Poor" if `averageScore` is below `50`.
### 3. Use a `switch` Statement
* Create an **integer** variable `day` and initialize it with a value between `1` and `7`.
* Use a `switch` statement to print the name of the day based on the value of `day` (e.g., `1` for `"Monday"`, `2` for `"Tuesday"`, etc.).

## `Part5`: Basic Calculator
### 1. Declare and Initialize Variables
* Declare variables to store two numbers (`num1`, `num2`) and the result (`result`).
* Declare a variable to store the operation choice (`operation`).
### 2. Read User Input
* Use the `Scanner` class to read the two numbers and the operation choice from the user.
### 3. Perform Arithmetic Operations
* Use `if-else` statements and logical operators to perform the chosen arithmetic operation (`+`, `-`, `*`, `/`) and store the result in `result`.
* Use a `switch` statement to handle the operations.
### 4. Increment and Decrement Operations
* Provide an option to increment or decrement the result by `1`.
* Use the increment (`++`) and decrement (`--`) operators.
### 5. Display Results:

Print the result of each calculation.