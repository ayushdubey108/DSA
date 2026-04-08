package FunctionsOrMethods.java;

public class ScopeofVariable2 {
    static int i;
    public static void main(String[] args) {
        i=15;
        fun();
    }
    public static void fun(){
        System.out.println(i);
    }
}
