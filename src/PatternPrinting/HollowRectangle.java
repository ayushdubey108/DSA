package PatternPrinting;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of columns : ");
        int m = sc.nextInt();
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        int k = n/2 + 1; //..........."m" STANDS FOR MIDDLE TERM
        for (int i = 1; i <= n; i++) {// rows
            for (int j = 1; j <= m; j++) { //cols
                if (i == 1 || i == n || j == 1 || j == m)
                    System.out.print("*" + " ");
                else
                    System.out.print(" " + " ");
            }
            System.out.println(" ");
        }
    }
}
