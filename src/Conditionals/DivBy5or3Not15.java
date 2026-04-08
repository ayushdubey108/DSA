/*package Conditionals;
import java.util.Scanner;
public class DivBy5or3Not15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        if(n % 5 == 0 || n % 3 == 0 ) { // OR WRITE THIS WAY  if(n % 5 == 0 || n % 3 == 0 && n % 15 != 0). THIS WORKS ALSO.
            if(n % 15 != 0){ // ALSO LIKE THIS WAY if(n%15 != 0 && n%5==0 || n%3 == 0)
                System.out.println("Divisible by 5or3 but not with 15.");
        }
            else{
            System.out.println("Invalid");
        }
    }
        else{
            System.out.println("Absolute Invalid"); }
    }
}*/
package Conditionals;
import java.util.Scanner;
public class DivBy5or3Not15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        if(n%15 != 0 && (n%5==0 || n%3 == 0)) { // OR WRITE THIS WAY  if(n % 5 == 0 || n % 3 == 0 && n % 15 != 0). THIS WORKS ALSO.
            // TO Fix this syntax True and false problem REFER NOTES COPY OF JAVA THIS STAR QUESTION WRONG if(n%15 != 0 && n%5==0 || n%3 == 0) AND corrected given above
            System.out.println("Divisible by 5or3 but not with 15.");
        }
        else{
            System.out.println("Absolute Invalid"); }
    }
}
