package Array;
import java.util.Scanner;
public class SumofArrat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;// kyuki sb kuch 0 se add hoga
        for (int num : arr) {// for(int i=0; i<n; i++)
             sum += num;// ye sum vhi int sun wala hai
        }
        System.out.println("The sum of elements of array is : "+sum); // This prints the sum
    }
}
