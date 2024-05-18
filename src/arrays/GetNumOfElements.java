package arrays;

public class GetNumOfElements {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4};
        int numOfElements = getNumOfElements(numbers);
        System.out.println("The number of elements in the array is: " + numOfElements);
    }

    public static int getNumOfElements(int[] array) {
        return array.length;
    }

}
