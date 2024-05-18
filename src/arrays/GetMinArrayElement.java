package arrays;

public class GetMinArrayElement {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        int minValue = getMin(numbers);

        System.out.println("The minimum value in the array is: " + minValue);
    }

    public static int getMin(int[] array) {

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
