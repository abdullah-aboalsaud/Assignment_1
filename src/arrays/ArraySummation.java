package arrays;

public class ArraySummation {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = getSummation(numbers);
        System.out.println("The summation of the array elements is: " + sum);
    }

    public static int getSummation(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }
}
