package JavaInput;
import java.util.Scanner;
public class  AreaofCircleWithInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double pie = 3.1415;
        double Area = pie * radius * radius;
        System.out.println("The Area of circle is : "+Area );
    }
}
