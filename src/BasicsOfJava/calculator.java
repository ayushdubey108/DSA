package BasicsOfJava;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a : ");
        double a = sc.nextDouble();
        System.out.println("Enter value of b : ");
        double b = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /, %): ");
        char op = sc.next().charAt(0);
        double result;
        switch (op) {
            case '+':
                result = a + b;
                System.out.println("Result = " + result);
                break;

            case '-':
                result = a - b;
                System.out.println("Result = " + result);
                break;

            case '*':
                result = a * b;
                System.out.println("Result = " + result);
                break;

            case '/':
                if (b != 0) {
                    result = a / b;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;

            case '%':
                result = a % b;
                System.out.println("Result = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
        }


    }
}
