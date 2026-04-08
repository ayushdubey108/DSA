package Array;

public class ReverseArray {
//    public static void print(int[] arr){
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//    //OR
//    public static void swap(int[] arr, int i, int j){
//        int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//    }
    // yha tak
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,11,9,23};
        int n = arr.length;
            //print(arr);
            int i=0, j=n-1;// agar kuch specific indices ko hi swap krna hota to aise kro(int i = 1, j=5;) ho jayega

            while(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                // OR
                //swap(arr,i,j);
                i++;
                j--;
            }
            for(int ele : arr) System.out.print(ele+" ");
            //print(arr);
    }
}
