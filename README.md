# CalculatorApp
🧮 Modern Calculator (Java Swing)

A sleek, lightweight modern calculator built using Java Swing.
It features a minimal design, intuitive layout, and responsive buttons for basic arithmetic operations.

✨ Features

Clean, modern UI (Segoe UI font + soft gray theme)

Supports basic arithmetic: +, -, *, /

Functional buttons:

C → Clear all

DEL → Delete last digit

= → Calculate result

Handles decimal numbers

Protects against division by zero

Interactive GUI (no console needed)

🖥️ Preview
+--------------------------------+
|           123 + 456            |
+--------------------------------+
| C | DEL |  /  |  *  |
| 7 |  8  |  9  |  -  |
| 4 |  5  |  6  |  +  |
| 1 |  2  |  3  |  =  |
| 0 |  .  |     |     |
+--------------------------------+

🛠️ Requirements

Java JDK 8+

Works on any OS (Windows / macOS / Linux)

Any IDE or terminal that supports Java Swing

🚀 How to Run

Save the file as ModernCalculator.java

Open terminal or your IDE

Compile and run:

javac ModernCalculator.java
java ModernCalculator


The GUI window will open automatically.

🧠 How It Works

The display (JTextField) shows user input and results

Button clicks are captured using ActionListener

The program stores:

num1: first number

num2: second number

operator: selected operation

When = is pressed, it performs the calculation and displays the result

🧩 Future Improvements

Add keyboard input support

Add scientific calculator functions (sin, cos, sqrt, etc.)

Improve layout responsiveness for resizing

Add memory buttons (M+, M-, MR)

📄 License

This project is open-source and free to use for learning, modification, or demonstration purposes.
