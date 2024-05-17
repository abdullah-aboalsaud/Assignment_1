package loops;

import java.util.Scanner;

public class DivideByTwoCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();


        int count = 0;
        int tempNumber = number;

        // Count how many times we can divide the number by 2
        while (tempNumber >= 2) {
            tempNumber /= 2;
            count++;
        }


        System.out.println("The number can be divided by 2 for " + count + " times.");

        scanner.close();
    }
}
