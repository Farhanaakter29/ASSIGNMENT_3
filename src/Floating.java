//exercise 5.2
import java.util.*;

public class Floating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter float number : ");
        float n = sc.nextFloat();
        if(n == 0){
            System.out.print("Zero");
        }
        else if(n > 0){
            System.out.print("Positive ");
        }
        else{
            System.out.print("Negative ");
        }
        float absolut_n = Math.abs(n);
        if(absolut_n < 1 && absolut_n > 0){
            System.out.print("Small");
        }
        else if(absolut_n > 1000000){
            System.out.print("Large");
        }
    }
}