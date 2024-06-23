package session4;

public class Triangle extends Shape{

    public Triangle(double width, double height) {
        super(width, height);
    }


    @Override
    public void draw() {
        int rows = 5; // Number of rows for the triangle

        for (int i = 1; i <= rows; i++) {
            // Print stars for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after printing all stars in the current row
            System.out.println();
        }
    }

    @Override
    public double calculateArea() {
        return super.calculateArea();
    }

}
