package loops;

import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();


        int digitCount = 0;
        int tempNumber = Math.abs(number); // Get the absolute value to handle negative numbers


        do {
            digitCount++;
            tempNumber /= 10;
        } while (tempNumber > 0);


        System.out.println("Number of digits: " + digitCount);

        scanner.close();
    }
}
