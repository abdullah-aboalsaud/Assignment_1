package oop.season2.shape;

public class Main {
    public static void main(String[] args) {

        Shape triangle = new Triangle(4,6);
        triangle.calculateArea();

        System.out.println("\n" + "-------------------" + "\n");

        Shape rectangle = new Rectangle(3,4);
        rectangle.calculateArea();

    }
}
