//exercise 5.1
import java.util.*;
public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        if( n < 0){
            System.out.print("Negative");
        }
        else if(n == 0){
            System.out.print("Zero");
        }
        else{
            System.out.print("Positive");
        }
    }
}
