package Recursion;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        fun1(); // So to stop the continuous recurrence of this loop we are going to use the Recursion name topic in this
    }
        public static void fun1(){
            System.out.println("Great");
            fun2();
        }
    public static void fun2(){
        System.out.println("eat");
        fun3();
    }
    public static void fun3(){
        System.out.println("at");
        fun4();
    }
    public static void fun4(){
        System.out.println("Gre");
        fun1();
    }
}
