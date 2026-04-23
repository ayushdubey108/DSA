package CODEFORCES;

import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        long l = (long) Math.ceil((double)n / a);
        long b = (long) Math.ceil((double)m / a);
        long ans = l * b;
        System.out.println(ans);
    }
}
