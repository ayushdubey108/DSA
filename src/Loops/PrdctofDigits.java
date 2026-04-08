package Loops;

import java.util.Scanner;

public class PrdctofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        int n = sc.nextInt();
        int product = 1;
        int lastDigit = 0; // Initialising with 0 is not necessary.
        while(n!=0){
            lastDigit = n%10;
            product = product * lastDigit;
            n=n/10;
        }
        System.out.println("The number of digits are : "+(product));
    }
}
