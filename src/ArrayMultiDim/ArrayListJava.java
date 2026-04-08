package ArrayMultiDim;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1); a.add(2); a.add(3);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(3); b.add(2); b.add(3);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(5); c.add(56); c.add(123876);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a); arr.add(b); arr.add(c);
        //System.out.println(arr);

        // for(int i=0;i<arr.size();i++){
//     for(int j=0;j<arr.get(i).size();j++){
//         System.out.print(arr.get(i).get(j)+" ");
//     }
//     System.out.println();
// }

        arr.add(new ArrayList<>());
        arr.get(arr.size()-1).add(10);
        arr.get(arr.size()-1).add(20);

        for(ArrayList<Integer> list : arr){
            for(int ele : list){
                System.out.print(ele + " ");
            }
            System.out.println();
        }

    }
}
