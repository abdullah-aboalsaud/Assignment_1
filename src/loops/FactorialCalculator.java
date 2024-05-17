package loops;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // to store the factorial result
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + number + " is " + factorial);

        scanner.close();
    }
}
