package Recursion;
import java.util.Scanner;
public class Print1toN {
    static int n; // Its is applied for third method only
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        print(1);
        //print(1,n); ,,,,,,,,,applied for first two method,,,,,,,,,,,,
    }

//    public static void print(int n) { // DRY RUN THIS METHOD FOR BETTER UNDERSTANDING
//        if (n == 0) return;
//        print(n - 1);
//        System.out.println(n);
//    }
//         ,,,,,,,,,,,,,,,OR,,,,,,,,,,,,,,,,,,,,,,,,,,,,

//public static void print(int x,int n) {
//    if (x>n) return;
//    System.out.println(x);
//    print(x+1,n); // Do dry run for better understanding
//},,,,,,,,,,,,,,,,OR,,,,,,,,,,,,,,,

public static void print(int x) {
    if (x > n) return; // ======> BASE CASE
    System.out.println(x + " "); // =======>WORK
    print(x + 1); // Do dry run for better understanding  ===========> CALL
}
}
