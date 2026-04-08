package Conditionals;
//LEARN BECAUSE OF TO PRINT THE GIVEN INPUT NUMBERS.
import java.util.Scanner;

public class GreatestOfThreeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();
        System.out.println("Enter c : ");
        int c = sc.nextInt();
        if(c > b && c > a){
            System.out.println(c+" is greatest");
        }
        if(b > c && b > a){
            System.out.println(b+" is greatest");
        }
        if(a > b && a > c){
            System.out.println(a+" is greatest");
        }
    }
}
