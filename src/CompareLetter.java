//exercise 5.4
import java.util.*;
public class CompareLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        if (!s.isEmpty() && s.charAt(0) == s.charAt(s.length() - 1)) {
            System.out.print("First and last letter are the same.");
        } else {
            System.out.print("First and last letter are different.");
        }
    }
}