package Array;

public class MissingArray {
    public static void main(String[] args) {
        long[] arr = {1,2,3,4,5,6,8,9};
        long n = arr.length+1 ;// means ki 1 to n tk numbers honge arr me bs koi ek ni hoga to vo yha pr add hua hai
        long sum=n*(n+1)/2;
        long arraysum=0;
        for(long ele: arr){
            arraysum += ele;
        }
        System.out.println(sum-arraysum);// kisi bhi data type ko convert krne ke liye aise use krte hai

    }
}
