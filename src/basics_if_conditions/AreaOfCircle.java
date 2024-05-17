package basics_if_conditions;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double pi = 3.141592653589793;
        double area = pi * radius * radius;

        System.out.printf("Area is = " + area);
    }

}
