package MathDSA;

import java.util.Scanner;

public class NoOfDigits {
    public static void main(String[] args) {
//        int n = 10;
//        int b = 2;
//
//        int ans = (int)(Math.log(n) / Math.log(b)) + 1;
//
//        System.out.println(ans);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            n = n >> 1;
            count++;
        }
        System.out.println(count);
    }
}
