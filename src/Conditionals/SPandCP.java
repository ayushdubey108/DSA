package Conditionals;
import java.util.Scanner;
public class SPandCP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the CP : ");
        int CP = sc.nextInt(); //REMEMBER THIS STATEMENT WE HAVE TO WRITE JUST NEXT TO THE "SOUT" FOR INPUT VARIABLES
        System.out.print("Enter the SP : ");
        int SP = sc.nextInt();
        if(SP > CP ){
            System.out.println("Profit is : "+(SP-CP));
            }
        else if(SP==CP){
            System.out.println("No P and L");
        }
        else{
            System.out.println("loss is : "+(CP-SP));
        }
    }
}
