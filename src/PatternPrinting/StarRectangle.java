package PatternPrinting;

import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int n = sc.nextInt();
//        for(int i=1;i<=n;i++) {
//            for (int j = 1; j <= 5; j++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
        //<--------------OR SECOND METHOD GIVEN BELOW------------------>
        System.out.print("Enter the columns : ");
        int m = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for (int j = 1; j <= m; j++) {
                System.out.print("* ");
            }
            System.out.println(); // enter
        }
    }
}
