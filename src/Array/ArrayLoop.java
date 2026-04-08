package Array;
import java.util.Scanner;
public class ArrayLoop {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter array of Size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        //input
        System.out.println("Enter array of Elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //output
        for(int i=0;i<n;i++){
            System.out.println("The output is : "+arr[i]+" ");//Multiply by 2 we double of each elements
        }
    }
}
