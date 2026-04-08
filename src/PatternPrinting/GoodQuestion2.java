package PatternPrinting;

import java.util.Scanner;

public class GoodQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int n = sc.nextInt();
        System.out.print("Enter columns : ");
        int m = sc.nextInt();// ..........SAME AS INVERTED WALA QUESTION HAI ACCHE SE SAMJHO BALAK...........
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n+1-i; j++){
                if(i%2!=0){
                    System.out.print((char)(i+64)+" ");
                }
                else{
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }
}
