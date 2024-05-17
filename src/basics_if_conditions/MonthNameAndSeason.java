package basics_if_conditions;

import java.util.Scanner;

public class MonthNameAndSeason {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a month number (1-12): ");
        int month = input.nextInt();

        switch (month) {
            case 1 :
                System.out.println("January" + "\nThe month is in Winter");
                break;
            case 2:
                System.out.println("February" + "\nThe month is in Winter");
                break;
            case 3:
                System.out.println("March" + "\nThe month is in Spring");
                break;
            case 4:
                System.out.println("April" + "\nThe month is in Spring");
                break;
            case 5:
                System.out.println("May" + "\nThe month is in Spring");
                break;
            case 6:
                System.out.println("June" + "\nThe month is in Summer");
                break;
            case 7:
                System.out.println("July" + "\nThe month is in Summer");
                break;
            case 8:
                System.out.println("August" + "\nThe month is in Summer");
                break;
            case 9:
                System.out.println("September" + "\nThe month is in Autumn");
                break;
            case 10:
                System.out.println("October" + "\nThe month is in Autumn");
                break;
            case 11:
                System.out.println("November" + "\nThe month is in Autumn");
                break;
            case 12:
                System.out.println("December" + "\nThe month is in Winter");
                break;
            default:
                System.out.println("Invalid month number");
        }
    }

}
