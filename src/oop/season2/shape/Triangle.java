package oop.season2.shape;

public class Triangle extends Shape {

    private int base;
    private int height;

    public Triangle(int base, int height) {
     this.base= base;
     this.height = height;
    }

    @Override
    public double calculateArea() {
        int rows = height;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
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
