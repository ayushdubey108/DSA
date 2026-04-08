package Array;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListJava {
    public static void main(String[] args) { //major difference in both vector and array syntax lekin aisa c++ me nahi hota hai
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(5);
        arr.add(10);
        System.out.println(arr.get(4));
        arr.set(3,50); // iska mtlb hai ki arr[3]=50 hai!!!!!!
        System.out.println(arr);
        int n=arr.size(); // arr.length
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+" ");
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        //25 21 18 50 10
        arr.add(78);// 25,21,18,50,10,78
        arr.add(1,100);
        System.out.println(arr);
        arr.remove(arr.size()-1);
        System.out.println((arr));
        Collections.reverse(arr);// aisa krne se reverse hota hai lekin import se define krna padega Collection term ko
        System.out.println(arr);
    }
}
