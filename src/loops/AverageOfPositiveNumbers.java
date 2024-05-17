package loops;

import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter a positive number (enter a negative number to stop): ");
            int number = scanner.nextInt();

            // Checking if the number is negative
            if (number < 0) {
                break;
            }

            sum += number;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of the positive numbers: " + average);
        } else {
            System.out.println("No positive numbers were entered.");
        }

        scanner.close();
    }

}
