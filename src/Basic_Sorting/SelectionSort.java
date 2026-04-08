package Basic_Sorting;

public class SelectionSort {
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
                int min=Integer.MAX_VALUE, mindx = -1;
                for (int j = i; j < n; j++) {// total no of ops=(n-1)whole square.
                    if (arr[j] < min) { // ascending and descending order print krne ke liye
                        min = arr[j];
                        mindx=j;
                    }
                }
                // swap
                int temp = arr[i];
                arr[i]=arr[mindx];
                arr[mindx]=temp;
            }
            System.out.println("After Sorted");
            print(arr);
        }
    }

