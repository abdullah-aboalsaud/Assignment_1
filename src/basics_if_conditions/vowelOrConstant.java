package basics_if_conditions;

import java.util.Scanner;

public class vowelOrConstant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");

        char ch = input.next().charAt(0);

        // Check method
        if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')
                || (ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U')) {
            System.out.println("The character is a vowel");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("The character is a consonant");
        } else {
            System.out.println("Invalid input");
        }
    }

}

