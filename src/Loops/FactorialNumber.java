package Loops;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        int n = sc.nextInt();
        long fact =1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        System.out.println("The factorial of numbers are : "+(fact));
    }
}
