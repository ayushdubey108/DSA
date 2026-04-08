package CODEFORCES;

import java.util.Scanner;

public class TheNewYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int left  = Math.min(x1, Math.min(x2, x3)); // i used numbers arranged in number line 1....4....7
        int right = Math.max(x1, Math.max(x2, x3));
        int mid   = (x1 + x2 + x3) - left - right;
        int R1 = Math.abs(mid - left);
        int R2 = Math.abs(right - mid);
        int answer = R1 + R2;
        System.out.println(answer);
    }
}
