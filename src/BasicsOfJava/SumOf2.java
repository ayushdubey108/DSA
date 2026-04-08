package BasicsOfJava;
import java.util.Scanner;
public class SumOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("The Sum of above two number is : "+(x+y));
        int subtract = x - y;
        System.out.println("The difference between two numbers is : "+(subtract));
    }
}
