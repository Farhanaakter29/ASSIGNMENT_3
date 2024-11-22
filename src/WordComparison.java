//exercise 5.5
import java.util.*;
public class WordComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        int length = word.length();
        int midpoint = length / 2;
        String firstHalf = word.substring(0, midpoint);
        String secondHalf;
        if (length % 2 == 0) {
            secondHalf = word.substring(midpoint);
        }
        else {
            secondHalf = word.substring(midpoint + 1);
        }
        if (firstHalf.equals(secondHalf)) {
            System.out.println("First and second half same");
        }
        else {
            System.out.println("First and second half different");
        }
        sc.close();
    }
}