package loops;

public class DivisibleByFive {
    public static void main(String[] args) {
        // Loop from 1 to 99
        for (int i = 1; i <= 99; i++) {
            // Check if the number is divisible by 5
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
