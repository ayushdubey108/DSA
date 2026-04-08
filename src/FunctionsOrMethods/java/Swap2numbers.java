package FunctionsOrMethods.java;
import java.util.Scanner;
public class Swap2numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a = ");
        System.out.print("Enter b = ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        a =a + b;// int temp = a;
        b =a - b;// a = b;
        a =a - b;//b = temp;
        System.out.println("After Swapping a = "+a);
        System.out.println("After Swapping b = "+b);
    }
}
