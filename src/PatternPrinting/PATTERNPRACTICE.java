package PatternPrinting;

import java.util.Scanner;

public class PATTERNPRACTICE {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();// row
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println( );
        }
    }
}
