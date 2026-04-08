package Conditionals;
import java.util.Scanner;
public class DivisibleBy5orNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        if(n%5 == 0){
            System.out.println("Given number is divisible by 5");
        }
        else{
            System.out.println("Not divisible by 5");
        }
    }
}
