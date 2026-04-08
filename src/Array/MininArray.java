package Array;

public class MininArray {
    public static void main(String[] args) {
    int[] arr = {-4,5,6,-5,89,45,32,99,3,4,5};
    int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
        if(arr[i]<min) min = arr[i];
    }
    int smin = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
        if(arr[i]<smin && arr[i]!=min) smin = arr[i];
    }
        System.out.println(min);
        System.out.println(smin);
}
}
