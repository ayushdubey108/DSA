package Recursion;

import java.util.Scanner;

public class PrintNto1 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            print(n); // we used this to stop the continuous printing of the loop
        }
        public static void print(int n){
            if(n==0) return;
            System.out.println(n);
            print(n-1);

    }
}
