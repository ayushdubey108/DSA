package Conditionals;
import java.util.Scanner;
public class AbsoluteValueOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        if (n <= 0) {
            // OR YOU CAN ALSO WRITE LIKE THIS WAY AFTER IF WRTE n = n*(-1)
            System.out.println("The absolute value is : "+(n = -n));
        } else{
            System.out.println("The absolute value is : "+(n));
        }
    }
}
