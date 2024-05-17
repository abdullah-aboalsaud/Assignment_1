package basics_if_conditions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the first number from user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Taking the second number from the user
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Taking the operator from the user
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // to store the result
        double result;

        // Performing the operation based on the input operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("The result is: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("The result is: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("The result is: " + result);
                break;
            case '/':
                // Handling division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The result is: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator. Please enter one of +, -, *, /.");
        }

        scanner.close();
    }
}
