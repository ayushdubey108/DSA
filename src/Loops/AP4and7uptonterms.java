package Loops;

import java.util.Scanner;

public class AP4and7uptonterms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int i;
//        for(i=1; i<=3*n+1; i+=3 ) {
//            //System.out.println(i);
//            System.out.println(i+" ");
//        }
        int a=4, d=3;
        for(i=1; i<=n; i++){
            System.out.print(a+" ");
            a += d;// THIS ALSO VERY STAR RATING POINT FOR FURTHER info SEE GP wala code kyuki + AP me krte hai aur * GP me krte hai
        }
    }
}
