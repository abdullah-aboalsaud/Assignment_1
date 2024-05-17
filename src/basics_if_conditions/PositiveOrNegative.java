package basics_if_conditions;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking the number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("Number is positive.");
        } else {
            System.out.println("Number is negative.");
        }
    }
}
