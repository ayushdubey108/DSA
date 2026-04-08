package Conditionals;
import java.util.Scanner;
public class ThreeDigitOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        if( n > 99 && n < 1000){
            System.out.println("Given number is a three digit number");
        }
        else{
            System.out.println("Not a three digit number");
        }
    }
}
