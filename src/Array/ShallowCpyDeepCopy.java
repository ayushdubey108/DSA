package Array;
import java.util.Arrays;
public class ShallowCpyDeepCopy {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40}; //16bit
        //int[] x = arr; // x is shallow copy of arr
        //x[0] = 100;// maine 0 wale ko 100 se change kar diya h
        int[] deep = Arrays.copyOf(arr,arr.length); // deep copy
        deep[0] = 100;
        System.out.println(arr[0]);
    }
}
