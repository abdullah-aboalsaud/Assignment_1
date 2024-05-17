package loops;

public class NumberSequenceByTwo {

    public static void main(String[] args) {
        // Initialize the first number in the sequence
        int number = 1;

        // Display the sequence
        for (int i = 0; i < 10; i++) { // There are 10 numbers in the sequence
            System.out.print(number + " ");
            number *= 2; // Double the number for the next term
        }
    }


}
