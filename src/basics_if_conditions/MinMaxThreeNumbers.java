package basics_if_conditions;

import java.util.Scanner;

public class MinMaxThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking three numbers as input from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Finding the maximum using conditional operators
        double max = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);

        // Finding the minimum using conditional operators
        double min = (num1 < num2) ? ((num1 < num3) ? num1 : num3) : ((num2 < num3) ? num2 : num3);

        // Output the maximum and minimum
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

        scanner.close();
    }
}

