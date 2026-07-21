package CODEFORCES;

import java.util.Scanner;

public class A1141 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int div = m/n;
        System.out.println(div);
        // if i do stopping potential of the function starting the moves of first
        // print division and then find lcm of a number
        int moves = 0;
        while (m > n) {
            if (m % 2 == 0) {
                m /= 2;
            } else if (m % 3 == 0) {
                m /= 3;
            } else {
                System.out.println(-1);
                return;
            }
            moves++;
        }
        if (m == n) System.out.println(moves);
        else System.out.println(-1);

    }
}
