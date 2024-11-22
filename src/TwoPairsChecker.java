//exercise 5.10
import java.util.Arrays;
import java.util.Scanner;
public class TwoPairsChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter four integers separated by spaces: ");
        int[] numbers = new int[4];
        for (int i = 0; i < 4; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        if ((numbers[0] == numbers[1] && numbers[2] == numbers[3]) ||
                (numbers[0] == numbers[1] && numbers[1] != numbers[2] && numbers[2] == numbers[3])) {
            System.out.println("Two pairs");
        } else {
            System.out.println("Not two pairs");
        }
        sc.close();
    }
}