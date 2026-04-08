package JavaInput;
import java.util.Scanner;
public class FindRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dividend : ");
        int a = sc.nextInt();
        System.out.println("Enter divisor : ");
        int b = sc.nextInt();
        int q = a/b;
        int r = a - (b*q);
        System.out.println("The remainder when "+a+" is by " + b + " is " + r);
        ; //THIS IS MOST IMPORTANT LINE IN THIS WRITTEN CODE 5STAR POINT AND REMEBER IT EVERY TIME.
    }
}
