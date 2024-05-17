package loops;

public class DivisibleByFiveOrSix {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 100; i <= 200; i++) {
            if ((i % 5 == 0 || i % 6 == 0) && !(i % 5 == 0 && i % 6 == 0)) {
                System.out.print(i + " "); // Print the number
                count++;
                // Check if 10 numbers have been printed per line
                if (count % 10 == 0) {
                    System.out.println(); // Move to the next line
                }
            }
        }
    }
}
