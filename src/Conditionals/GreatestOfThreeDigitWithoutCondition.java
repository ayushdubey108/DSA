package Conditionals;

import java.util.Scanner;

public class GreatestOfThreeDigitWithoutCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();
        System.out.println("Enter c : ");
        int c = sc.nextInt();
        if(c > b) {
            if (c > a) {
                System.out.println(c+ " is greatest");
            } else {//(c<a)
                System.out.println(a+ " is greatest");
            }
        }
        else{
            if(b > a){
                System.out.println(b+ " is greatest");
            }
            else{
                System.out.println(a+ " is greatest");
            }
        }

    }
}
