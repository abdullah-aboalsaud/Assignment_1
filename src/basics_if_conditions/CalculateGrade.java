package basics_if_conditions;

import java.util.Scanner;

public class CalculateGrade {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Taking the input marks from the user
            System.out.print("Enter your marks: ");
            int marks = scanner.nextInt();

            //to store the grade
            String grade;

            // Calculating the grade based on the marks
            if (marks >= 80 && marks <= 100) {
                grade = "A";
            } else if (marks >= 60 && marks < 80) {
                grade = "B";
            } else if (marks >= 40 && marks < 60) {
                grade = "C";
            } else if (marks >= 0 && marks < 40) {
                grade = "F";
            } else {
                grade = "Invalid marks entered";
            }

            // result
            System.out.println("Your grade is: " + grade);

            scanner.close();
        }


}
