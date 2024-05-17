package basics_if_conditions;

import java.util.Scanner;

public class GreatestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Input the 1st number: ");
        int num1 = scanner.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = scanner.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = scanner.nextInt();


        int greatest = num1;

        if (num2 > greatest) {
            greatest = num2;
        }

        if (num3 > greatest) {
            greatest = num3;
        }

        // Output
        System.out.println("The greatest: " + greatest);

        scanner.close();
    }

}


