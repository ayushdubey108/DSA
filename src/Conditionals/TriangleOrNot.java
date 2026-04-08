package Conditionals;
import java.util.Scanner;
public class TriangleOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("Enter c : ");
        int c = sc.nextInt();
        if(a+b>c && b+c>a && a+c>b) { //This is important formula to detect whether it is triangle or not.
            System.out.println("Yes it is a triangle");
        }
        else {
            System.out.println("Not a triangle ");
        }
    }
}
