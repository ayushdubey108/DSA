package CODEFORCES;

import java.util.Scanner;

public class MovesDreamoonAndStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int moves = (int)Math.ceil(n / 2.0);
        while (moves % m != 0) {
            moves += 1;
        }
        if (moves > n) {
            System.out.println(-1);
        }
        else{
            System.out.println(moves);
        }
    }
}
