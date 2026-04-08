package CODEFORCES;

import java.util.Scanner;

public class A1141 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int moves = 0;
        while (m > n) {
            if (m % 2 == 0) {
                m /= 2;
            } else if (m % 3 == 0) {
                m /= 3;
            } else {
                System.out.println(-1);
            }
            moves++;
        }
        System.out.println(moves);

    }
}
