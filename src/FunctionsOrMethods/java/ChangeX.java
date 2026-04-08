package FunctionsOrMethods.java;

public class ChangeX {
    public static void change(int x){
        x = 20;
    }
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}
