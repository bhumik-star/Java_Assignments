/*50. TASK 3 - MENU-DRIVEN CALCULATOR
-----------------------------------

Required filename: MenuCalculator.java

Create a calculator with these menu choices:

    1. Add
    2. Subtract
    3. Multiply
    4. Divide
    0. Exit

Requirements:

- Use do-while so the menu appears at least once.
- Use switch to select the operation.
- Reject invalid menu choices.
- Prevent division by zero.
- Use at least one void method and one value-returning method.
- Use this modular flow in main: printMenu, read/validate choice, read operands,
  call calculate, and display the returned result.
- Continue until the user selects 0.

This is a high-value self-directed exercise because it combines conditions,
switch, a repetition loop, input validation, division-by-zero handling, void
methods, value-returning methods, parameters, and repeated method calls. */

import java.util.Scanner;

public class MenuCalculator {
    public static void main() {
        Scanner input = new Scanner(System.in);
        int choice;
        double num1, num2, result;

        do {
            printMenu();
            choice = input.nextInt();

            if (choice == 0) {
                System.out.println("Exiting the program...");
                break;
            }

            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice. Please choose from 0 to 4.");
                continue;
            }

            num1 = readNumber(input, "Enter first number: ");
            num2 = readNumber(input, "Enter second number: ");

            result = calculate(num1, num2, choice);

            if (Double.isNaN(result)) {
                System.out.println("Cannot divide by zero.");
            } else {
                System.out.println("Result: " + result);
            }

        } while (choice != 0);

        input.close();
    }

    public static void printMenu() {
        System.out.println("\nCalculator Menu");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("0. Exit");
    }

    public static int readChoice(Scanner input) {
        System.out.print("Enter your choice: ");

        while (!input.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            input.next();
            System.out.print("Enter your choice: ");
        }

        return input.nextInt();
    }

    public static double readNumber(Scanner input, String prompt) {
        System.out.print(prompt);

        while (!input.hasNextDouble()) {
            System.out.println("Invalid number. Please try again.");
            input.next();
            System.out.print(prompt);
        }

        return input.nextDouble();
    }

    public static double calculate(double a, double b, int choice) {
        switch (choice) {
            case 1:
                return a + b;
            case 2:
                return a - b;
            case 3:
                return a * b;
            case 4:
                if (b == 0) {
                    return Double.NaN;
                }
                return a / b;
            default:
                return 0;
        }
    }
}
