package basics_if_conditions;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a weight: ");

        int weight = scanner.nextInt();

        if (weight % 2 == 0 && weight >= 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
