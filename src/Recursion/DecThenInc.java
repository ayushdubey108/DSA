package Recursion;

import java.util.Scanner;

import static Recursion.Print1toN.n;

public class DecThenInc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n-1);       //,,,,,,,,,applied for first two method,,,,,,,,,,,,
    }

    public static void print(int n) { // DRY RUN THIS METHOD FOR BETTER UNDERSTANDING
        if (n == 0) return;
        System.out.println(n);
        print(n - 1); // This is we know that the it is a faith of a number
        if(n!=1)  System.out.println(n);
    }
}
