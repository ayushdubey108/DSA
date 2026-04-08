package PatternPrinting;

import java.util.Scanner;

public class StarRightDecr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int n = sc.nextInt();
        System.out.print("Enter columns : ");
        int m = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n+1-i; j++){// Keval i ka frk hai.............
                System.out.print("*");//For number put "j+" and for alphabet put (char) wala syntax
            }
            System.out.println();
        }
    }
}
