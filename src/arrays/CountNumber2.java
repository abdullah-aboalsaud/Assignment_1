package arrays;

public class CountNumber2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 2, 5, 2, 6};
        System.out.println("Number of occurrences of 2 is: " + count2(array));
    }

    public static int count2(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num == 2) {
                count++;
            }
        }
        return count;
    }

}