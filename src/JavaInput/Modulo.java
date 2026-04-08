package JavaInput;
import java.util.Scanner;
public class Modulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dividend : ");
        int a = sc.nextInt();
        System.out.println("Enter divisor : ");
        int b = sc.nextInt();
        int r = a%b; //SYMBOL OF MODULOOO & USED IN REMAINDER & USED IN "int" ONLY.....
        System.out.println("The remainder when "+a+" is by " + b + " is " + r);
    }
}
