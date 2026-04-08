package Loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        int n = sc.nextInt();
        int sum = 0;
        int lastDigit = 0;
        while(n!=0){ // jab tak n zero nahi ho jata tab tak n=n/10 krta rahunga and started with 0.
            lastDigit = n%10;
            sum = sum + lastDigit;
            n=n/10;
        }
        System.out.println("The number of digits are : "+(sum));
    }
}
