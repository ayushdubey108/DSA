package CODEFORCES;

import java.util.Scanner;

public class A1899 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];

        // Take all inputs first
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < t; i++) {
            int n = arr[i];

            if (((n + 1) % 3 == 0) || ((n - 1) % 3 == 0)) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        }
    }
}