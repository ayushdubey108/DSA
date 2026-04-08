package Loops;
import java.util.Scanner;
public class Number1to100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=100; i=i+1) {// if given to print numbers n number of times to print then write for(i=1;i<=n;i++)
            if(i%2==0)
            System.out.print(i+" ");// THIS ABOVE STATEMENT WE USE JUST TO PRINT THE NUMBERS ALL THE NUMBER THAT ABOVE GIVEN.
        }
    }
}
