// Write a program that depicts arithmetic operations using switch statements.

import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        performOperation(num1, num2, operation);

        scanner.close();
    }

    public static void performOperation(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Addition: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Subtraction: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Multiplication: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Division: " + result);
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }
}
