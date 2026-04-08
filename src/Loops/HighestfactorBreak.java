package Loops;
import java.util.Scanner;
public class HighestfactorBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int hf = 1; // composite numbers which have minimum of 3 factors.
        for(int i=n-1;i>=1;i--){
            if(n%i==0){ // i is a factor of n......
                hf=i;
                break;
            }
        }
        System.out.println("The highest factor is : "+(hf));
    }
}
