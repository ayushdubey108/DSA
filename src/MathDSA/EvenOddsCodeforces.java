package MathDSA;

import java.util.Scanner;

public class EvenOddsCodeforces{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long oddCount = (n + 1) >> 1;
        if (k <= oddCount) {
            System.out.println((k << 1) - 1);
        } else {
            System.out.println((k - oddCount) << 1);
        }
    }
}
