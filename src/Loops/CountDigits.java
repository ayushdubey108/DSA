package Loops;
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int n = sc.nextInt();
        int count = 0;
        //if(n==0) count++;
        while(n!=0){ // jab tak n zero nahi ho jata tab tak n=n/10 krta rahunga and started with 0.
            n=n/10;
            count++;
        }
        System.out.println("The number of digits are : "+(count));
    }
}
