package PatternPrinting;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*" + " ");
            }
                System.out.println();
//        int nsp = n-1, nst = 1; // AGAR nst=n LIKHOGE TO RHOMBUS BHI PRINT HO JAYEGA JADOOO......&&//&& AGR DONO 0,0 HOTO RIGHT DOWNWARD STAR PRINT HOGA
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= nsp; j++) {
//                System.out.print(" " + " ");
//            }
//            for (int j = 1; j <= nst; j++) {
//                System.out.print("*" + " ");
//            }
//            nsp--;
//            nst += 2; // AGAR 1 LIKHOGE TO RIGHT WAALA STAR WALE QUESTIONS BHI PRINT KAR SAKTE HO.....
//            System.out.println();



        }
    }
}
