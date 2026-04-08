package Loops;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int reversed = 0;
        int original = n;// YE LINE NUMBER 11111 HAI
        int lastDigit;
        while (n != 0) {  /*n % 10 gives the last digit.
            reversed = reversed * 10 + lastDigit shifts the current digits left and adds the new digit.
                    n = n / 10 removes the last digit.*/
            lastDigit = n % 10;
            reversed = reversed * 10 + lastDigit;
            n = n / 10;

        }
        int sum = reversed + original;// DONO KO ADD KRNE KE LIYE 3 LINE ADD KIA HU BASS. LINE NUMBER 2222222222
        System.out.println("Reversed number is: " +(reversed));

        System.out.println("The su of numbers are : "+(sum));// YE LINE NUMBER 2 HAIII BASSSS
    }
}
