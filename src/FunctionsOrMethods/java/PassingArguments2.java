package FunctionsOrMethods.java;

public class PassingArguments2 {
    public static void main(String[] args) {//111
        fun(70,-17);//222
        intro("Raghav",25);
    }
    public static void fun(int a, int b){//333
        System.out.println("Sum is : "+(a+b));//444
    }
    public static void intro(String name, int age){// 55555
        System.out.println("Hello "+name+ " Your age is "+age);
    }
}
