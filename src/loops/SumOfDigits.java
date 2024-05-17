package loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();


        int sum = 0;
        int tempNumber = Math.abs(number); // Get the absolute value to handle negative numbers

        while (tempNumber > 0) {
            int digit = tempNumber % 10; // Extract the last digit
            sum += digit;  // Add the digit to the sum
            tempNumber /= 10; // Remove the last digit
        }


        System.out.println("Sum of digits: " + sum);

        scanner.close();
    }
}
