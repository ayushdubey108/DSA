package CODEFORCES;

import java.util.Scanner;

public class A1030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            if(n == 0){
                System.out.println("Easy");
            }
            else{
                System.out.println("Hard");
            }
        }
    }
}
