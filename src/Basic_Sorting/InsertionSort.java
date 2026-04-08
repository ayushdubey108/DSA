package Basic_Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3,7,1,3,9,5,4,1,8};
        // INSERTION SORT ALGORITH;
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j] = arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        for(int ele: arr) System.out.print(ele+" ");
    }
}
