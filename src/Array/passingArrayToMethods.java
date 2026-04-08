package Array;

public class passingArrayToMethods {
    public static void main(String[] args) {
        int[] x = {10,3,29,38};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
    public static void change(int[]x){// agr x ke lace pr y hoga to bhi change krega to 99
        x[2] = 99;
    }
    // ISME AISA KYU HO RAHA JABKI AGAR HAM VARIABLES
    // ENTER KRTE h to 29 hi print krega refer functions tab of coding java
}
// Jaisa niche ho rha h
//int x=10;
//change(x);
//System.out.println(x);
//}
//public static void change (int x){
//    x=20;
//}
//OUTPUT 10 hi hoga