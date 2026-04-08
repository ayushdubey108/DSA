package Loops;

import java.util.Scanner;
public class GP1and2and4uptonterms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int i; // 1 2 4 8 16 32.....
        int a=1, r=2;
        for(i=1; i<=n; i++ ) {
            //System.out.println(i);
            System.out.println(a+" ");
            a *=r; // VERY STAR RATING POINT GP ME MULTIPLY KRTE HAI AUR AP ME + KA USE KRKE KRTE HAI.
            //n = n/2;
        }
    }
}
