package CODEFORCES;

import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); // cost of first banana
        int n = sc.nextInt(); // initial number of dollars the soldier has
        int w = sc.nextInt(); // number of bananas he wants.
        long totalCost = (long) k*w*(w+1)/2;
        long borrow = totalCost - n;
        if(totalCost <=k*w){
            System.out.println(0);
        }
        else{
            System.out.println(borrow);
        }
    }
}
