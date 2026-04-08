package Loops;
import java.util.Scanner;
public class AP1and3uptonterms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms to print : ");
        int n = sc.nextInt();
        int i;
        for(i=1; i<=2*n-1; i+=2 ) {
            System.out.println(i);
        }
    }
}
