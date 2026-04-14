# FactorialByRecursion

A beginner-friendly Java project that demonstrates **recursion** by calculating the factorial of a number. This project is designed to help developers understand how recursive functions work, how the call stack is used, and how to reason about base and recursive cases.

---

## Table of Contents

- [Project Overview](#project-overview)
- [What This Project Demonstrates](#what-this-project-demonstrates)
- [Technology Stack](#technology-stack)
- [Project Structure](#project-structure)
- [How to Compile and Run](#how-to-compile-and-run)
- [Code Explanation](#code-explanation)
- [Example Output](#example-output)
- [Time and Space Complexity](#time-and-space-complexity)
- [Learning Outcomes](#learning-outcomes)
- [Contributing](#contributing)
- [License](#license)

---

## Project Overview

**Recursion** is a programming technique where a function calls itself to solve a smaller version of the same problem. Every recursive solution has two key parts:

1. **Base case** – the condition that stops the recursion.
2. **Recursive case** – the part where the function calls itself with a simpler input.

The **factorial** of a non-negative integer *n* (written as *n!*) is the product of all positive integers from 1 up to *n*:

```
n! = n × (n-1) × (n-2) × ... × 2 × 1
```

Examples:
- `5! = 5 × 4 × 3 × 2 × 1 = 120`
- `3! = 3 × 2 × 1 = 6`
- `1! = 1`

Factorial is one of the most intuitive problems to solve with recursion, making it a perfect starting point for learning the concept.

---

## What This Project Demonstrates

- How to write a **recursive function** in Java
- Identifying and implementing a **base case** to stop recursion
- How the **call stack** unwinds as recursive calls return
- Handling **edge cases** such as zero and negative numbers
- Reading user input with `Scanner` and displaying formatted output

---

## Technology Stack

| Technology | Version  |
|------------|----------|
| Java       | 8+       |
| IDE        | VS Code (with Java Extension Pack) or any Java IDE |

No external libraries or build tools are required.

---

## Project Structure

```
FactorialByRecursion/
├── src/
│   └── FactorialRecursion.java   # Main source file
├── bin/                          # Compiled .class files (generated)
├── .vscode/
│   └── settings.json             # VS Code Java settings
└── README.md
```

---

## How to Compile and Run

### Using the Terminal

1. **Navigate to the project root:**

   ```bash
   cd FactorialByRecursion
   ```

2. **Compile the source file:**

   ```bash
   javac -d bin src/FactorialRecursion.java
   ```

3. **Run the program:**

   ```bash
   java -cp bin FactorialRecursion
   ```

4. **Follow the prompt** – enter any positive integer to compute its factorial.

### Using VS Code

1. Open the project folder in VS Code.
2. Install the **Extension Pack for Java** if not already installed.
3. Open `src/FactorialRecursion.java`.
4. Click the **Run** button (▶) above the `main` method, or press `F5`.

---

## Code Explanation

```java
static int factorial(int num) {

    // Base case: factorial of 1 is 1 — stop the recursion here
    if (num - 1 == 0) {
        return 1;
    }
    // Edge case: 0 or negative numbers are not valid inputs
    else if (num == 0 || num < 0) {
        System.out.println("Consider numbers greater than 1!");
        return 0;
    }

    // Recursive case: n! = n × (n-1)!
    return num * factorial(num - 1);
}
```

### How the call stack works for `factorial(4)`

```
factorial(4)
  └─ 4 * factorial(3)
           └─ 3 * factorial(2)
                    └─ 2 * factorial(1)
                               └─ returns 1   ← base case reached
                    └─ returns 2 * 1 = 2
           └─ returns 3 * 2 = 6
  └─ returns 4 * 6 = 24
```

Each call waits on the stack until the base case is reached, then the results are multiplied back up the chain.

---

## Example Output

```
****************FACTORIAL RECURSION****************
Enter a number to get its factorial: 5
The factorial of 5 is 120
```

```
****************FACTORIAL RECURSION****************
Enter a number to get its factorial: -3
Consider numbers greater than 1!
0
```

---

## Time and Space Complexity

| Metric           | Complexity | Explanation                                                    |
|------------------|------------|----------------------------------------------------------------|
| Time Complexity  | O(n)       | The function makes exactly *n* recursive calls for input *n*.  |
| Space Complexity | O(n)       | Each recursive call adds a frame to the call stack, so *n* frames are held in memory at peak depth. |

> **Note:** For very large values of *n*, deep recursion can cause a `StackOverflowError`. An iterative solution or tail-call optimisation (not available natively in Java) would be needed for production use cases with large inputs.

---

## Learning Outcomes

After studying this project you will be able to:

- ✅ Explain what recursion is and when to use it
- ✅ Identify the base case and recursive case in a recursive function
- ✅ Trace the call stack for a recursive function manually
- ✅ Understand the memory implications of deep recursion
- ✅ Apply the same recursive pattern to other mathematical sequences (e.g., Fibonacci, power functions)

---

## Contributing

Contributions are welcome! If you have suggestions, improvements, or want to add an iterative version for comparison:

1. **Fork** the repository
2. **Create** a new branch: `git checkout -b feature/your-feature-name`
3. **Commit** your changes: `git commit -m "Add: description of change"`
4. **Push** to your branch: `git push origin feature/your-feature-name`
5. **Open a Pull Request** describing what you changed and why

Please keep changes focused and include comments in any new code to maintain the educational tone of this project.

---

## License

This project is open source and available under the [MIT License](https://opensource.org/licenses/MIT).
