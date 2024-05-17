package basics_if_conditions;

import java.util.Scanner;

public class SumPositiveNegative {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Taking input for 6 integers
            System.out.println("Enter 6 integers:");

            int sumPositive = 0;
            int sumNegative = 0;

            for (int i = 0; i < 6; i++) {
                int num = scanner.nextInt();
                if (num > 0) {
                    sumPositive += num;
                } else if (num < 0) {
                    sumNegative += num;
                }
            }

            // Output the sums
            System.out.println("Sum of positive integers: " + sumPositive);
            System.out.println("Sum of negative integers: " + sumNegative);

            scanner.close();
        }
    }

