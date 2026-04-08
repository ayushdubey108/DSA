package Array;

public class MaxxinArray {
    public static void main(String[] args) {
        int[] arr = {-4,5,6,7,89,45,32,99,3,4,5};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
        }
        int smax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax && arr[i]!=max) smax = arr[i];
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
