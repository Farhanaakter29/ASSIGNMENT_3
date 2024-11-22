import java.util.Scanner;

public class SequenceOrder {

    // Method to check strictly increasing or decreasing order
    public static String checkOrderStrict(int a, int b, int c) {
        if (a < b && b < c) {
            return "increasing";
        } else if (a > b && b > c) {
            return "decreasing";
        } else {
            return "neither";
        }
    }

    // Method to check lenient increasing or decreasing order
    public static String checkOrderLenient(int a, int b, int c) {
        if (a <= b && b <= c) {
            if (a >= b && b >= c) {
                return "both increasing and decreasing";
            }
            return "increasing";
        } else if (a >= b && b >= c) {
            return "decreasing";
        } else {
            return "neither";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the mode
        System.out.print("Should the sequence be strict or lenient? ");
        String mode = scanner.nextLine().trim().toLowerCase();

        // Read three numbers
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int c = scanner.nextInt();

        String result = "";

        if (mode.equals("strict")) {
            result = checkOrderStrict(a, b, c);
        } else if (mode.equals("lenient")) {
            result = checkOrderLenient(a, b, c);
        } else {
            System.out.println("Invalid mode. Please enter 'strict' or 'lenient'.");
            scanner.close();
            return;
        }

        // Print the result
        System.out.println(result);

        scanner.close();
    }
}
