package ArrayMultiDim;

import java.util.Scanner;
public class RotateImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{1, 2, 3}, {4,5,6}, {7,8,9}};
        System.out.println("Original Matrix:");
        print(arr);
        // Printing Transpose
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i /*arr[0].length*/ ; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
                //System.out.print(arr[i][j] + " ");
            }
        }
        for (int i = 0; i <= arr.length; i++) {
            for (int j = arr[0].length-1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nRotated Matrix:");
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
