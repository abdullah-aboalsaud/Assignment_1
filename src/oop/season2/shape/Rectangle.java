package oop.season2.shape;

public class Rectangle extends Shape {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {

        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
