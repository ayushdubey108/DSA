package Conditionals;
import java.util.Scanner;
public class ArAndPeriOfRectangle {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth : ");
        int breadth = sc.nextInt();
        int Area = length*breadth;
        int Perimeter = 2*(length + breadth);// VERY IMPORTANT LINE
        if(Area > Perimeter){
            System.out.println("The Area of Rectagle is greater than its Perimeter.");
        }
        else if(Area == Perimeter){ // VERY IMPORTANT LINE THIS IS.
            System.out.println("The Area is equal to its perimeter");
        }
        else{
            System.out.println("The Area is less than its perimeter.");
        }
    }

}
