package loops;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the base input from the user
        System.out.print("Enter the base: ");
        int base = scanner.nextInt();

        // Taking the power input from the user
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        // Calculating the base raised to the power using a loop
        int result = 1;
        for (int i = 1;i<= power; i++) {
            result *= base;
        }

        // Output the result
        System.out.println(base + " ^ " + power + " = " + result);

        scanner.close();
    }
}

