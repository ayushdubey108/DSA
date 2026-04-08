package CODEFORCES;

import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String s = String.valueOf(n);
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '4' || ch == '7') {
                count++;
            }
        }
        String cntStr = String.valueOf(count);
        if (cntStr.matches("[47]+")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
