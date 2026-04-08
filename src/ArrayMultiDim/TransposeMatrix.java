package ArrayMultiDim;
import java.util.Scanner;
public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{2, 8, 3, 4}, {7, 2, 1, 6}, {5, 5, 4, 1}, {3,1,8,2}};
        System.out.println("Original Matrix:");
        print(arr);
        // Printing Transpose
        for (int i = 1; i < arr.length; i++) {
                for (int j = 0; j < i /*arr[0].length*/ ; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                    System.out.print(arr[i][j] + " ");
                }
            }
        System.out.println("\nTransposed Matrix:");
        print(arr);
    }
    private static void print(int[][] arr){
        for(int[]a : arr){
            for(int ele : a){
                System.out.print(ele+ " ");
            }
            System.out.println();
        }
    }
}
