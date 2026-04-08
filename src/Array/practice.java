package Array;
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in array : ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();}
        int prdct=1;
        for(int i=0; i<n; i++){
            prdct *= arr[i];
        }
        System.out.println(+prdct);
    }
}
