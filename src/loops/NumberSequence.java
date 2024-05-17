package loops;

public class NumberSequence {
    public static void main(String[] args) {

        int startValue = 7;
        // Difference between terms
        int difference = 7;

        int numberOfTerms = 14;

        for (int i = 0; i < numberOfTerms; i++) {
            System.out.print(startValue + " ");
            startValue += difference;
        }

    }

}
