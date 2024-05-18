package arrays;

public class EvenNumberCalculator {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};

        int[] result = CalculateEven(numbers);

        System.out.println("Sum of even numbers: " + result[0]);
        System.out.println("Count of even numbers: " + result[1]);
    }

    // Function to calculate the sum and count of even numbers in the array
    public static int[] CalculateEven(int[] array) {
        int sum = 0;
        int count = 0;

        // Iterate through the array
        for (int num : array) {
            if (num % 2 == 0) {
                sum += num;
                count++;
            }
        }

        // Return the results as an array
        return new int[]{sum, count};
    }
}
