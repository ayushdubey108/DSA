package Loops;
import java.util.Scanner;
public class PrintTableOfn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to print its Table : ");
        int n = sc.nextInt();
        for(int i=n; i<=n*10; i=i+n){
            System.out.print(i+" ");
        }

    }
}
