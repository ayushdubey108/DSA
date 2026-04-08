package Conditionals;
import java.util.Scanner;
public class DivisibleBy5and3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        if(n % 15 == 0){
            System.out.println("Given number is divisible by 5 and 3. ");
        }
        else{
            System.out.println("Not divisible by 5 and 3. ");
        }
    }
}
//THIS IS THE SECOND AND COMPLICATED METHOD TO SOLVE ANY PROBLEMS.
/*
package Conditionals;
import java.util.Scanner;
public class DivBy5or3Not15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        if(n % 5 == 0) {
            if(n % 3 == 0){
                System.out.println("Divisible by 5and3 both.");
        }
            else{
            System.out.println("Not divisible");
        }
    }
        else{
            System.out.println("Not divisible"); }
    }
}

 */
