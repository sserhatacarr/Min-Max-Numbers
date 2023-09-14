import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter: ");
        int n = sc.nextInt();

        int i = 0;
        int min = Integer.MAX_VALUE; // Initialize minimum value as maximum possible
        int max = Integer.MIN_VALUE; // Initialize maximum value as minimum possible

        while (i < n) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = sc.nextInt();

            // Compare each new number with current minimum and maximum, and update if necessary
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }

            i++;
        }

        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}
