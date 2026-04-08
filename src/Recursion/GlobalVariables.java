package Recursion;

import java.util.Scanner;

import static Recursion.Basics.fun1;

public class GlobalVariables {
    static int x = 10; // GLOBAL variable function ke bahar bnte hai
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        x=8;
        System.out.println(x);
        x=7;// local variable dclaration
        // ham aisa bhi nahi kr skte hai int x = 9; ek hi me do br declare ghanghor paap hai
        System.out.println(x);
       // fun1();
        System.out.println(x);
    }
    public static void fun1(){
        x = 90;
        System.out.println(x);
    }
}
