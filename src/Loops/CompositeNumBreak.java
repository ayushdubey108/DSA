package Loops;
import java.util.Scanner;
public class CompositeNumBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false; // false means prime and used to detect prime numbers
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n % i == 0) { // i is factor of n
                flag = true; // true means composite
                break;
            }
        }
        if (n == 1) {
            System.out.println("Neither prime nor composite");
        }
        else if(!flag)// HAM ISSE AISE BHI LIKH SAKTE HAI.*****VERY STAR RATING POINT IT IS.********
            System.out.println("Prime Number");
        else {
            System.out.println("Composite Number");
        }
    }
}




