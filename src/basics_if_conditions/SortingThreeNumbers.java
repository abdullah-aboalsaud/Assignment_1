package basics_if_conditions;

import java.util.Scanner;

public class SortingThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking three floating-point numbers as input from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Variables to hold the sorted numbers
        double first = 0, second = 0, third = 0;

        // Sorting the numbers using conditional statements
        if (num1 <= num2 && num1 <= num3) {
            first = num1;
            if (num2 <= num3) {
                second = num2;
                third = num3;
            } else {
                second = num3;
                third = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            first = num2;
            if (num1 <= num3) {
                second = num1;
                third = num3;
            } else {
                second = num3;
                third = num1;
            }
        } else {
            first = num3;
            if (num1 <= num2) {
                second = num1;
                third = num2;
            } else {
                second = num2;
                third = num1;
            }
        }

        // Output the sorted numbers
        System.out.println("Sorted numbers:");
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        scanner.close();
    }
}


