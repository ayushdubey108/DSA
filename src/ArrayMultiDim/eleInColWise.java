package ArrayMultiDim;

import java.util.Scanner;

public class eleInColWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{2, 3, 4, 5}, {9, 8, 7, 6}, {6, 9, 23, 5}};
        for (int j = 0; j < arr[0].length; j++){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
