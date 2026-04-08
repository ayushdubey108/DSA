package Basic_Sorting;
public class BubbleSort {
    public static void print(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, -6, 1, 9, 4, 2};
        int n = arr.length;
        System.out.println("before Sorted");
        print(arr);
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {// total no of ops=(n-1)whole square.
                if (arr[j] < arr[j + 1]) { // ascending and descending order print krne ke liye
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("After Sorted");
            print(arr);
        }
    }
