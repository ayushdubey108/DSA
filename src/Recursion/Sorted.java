package Recursion;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {3,4,2,6,7,9};
        System.out.println(sorted(arr,0));

    }
    static boolean sorted(int[] arr, int index){
        // Base Condition
        if(index == arr.length-1){
            return true;
        }
        return arr[index+1] >= arr[index] && sorted(arr, index+1);
    }
}
