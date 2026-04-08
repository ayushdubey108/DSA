package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fibonacci(7));
    }
    static int Fibonacci(int n) {
        // base condition
        if (n < 2) {
            return n;
        }

        return Fibonacci(n - 1)+Fibonacci(n - 2);
    }
}
