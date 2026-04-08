package Array;
import java.util.Arrays;
public class  SortArrayBuiltIn {
    public static void main(String[] args) {
        // sort - ascending order
        int[] arr = {4, 1, 7, 5, -3, 10, 2};
        print(arr);// sorting ke kaam aata hai
        Arrays.sort(arr);// sort in ascending order to go on.....

        print(arr);
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++) {// if-else wale ko hata kr for ke bd sout lgane se elements sort hojate h asce. order ne!!!
            System.out.print(arr[i]+" "); //if (i % 2 == 0) {
              //  System.out.print((10 + arr[i]) + " ");
            //} else
              //  System.out.print(2 * arr[i] + " ");
        }
        System.out.println();
    }
}
