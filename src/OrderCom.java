//exercise 5.9
import java.util.*;
public class OrderCom{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
        if ((num1 < num2 && num2 < num3) || (num1 > num2 && num2 > num3)) {
            System.out.println("In order");
        } else {
            System.out.println("Not in order");
        }
    }
}
