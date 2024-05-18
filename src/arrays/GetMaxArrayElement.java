package arrays;

public class GetMaxArrayElement {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        int maxValue = getMax(numbers);

        System.out.println("The maximum value in the array is: " + maxValue);
    }

    public static int getMax(int[] array) {

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}


