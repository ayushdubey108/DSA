package Array;
public class Linearsearch {
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5, 6,7,8,9,34,54,98,23};
        int x = 99;
        boolean flag = false;// nahi milaa
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                flag = true;//mil gya
                break;
            }
        }
        if(flag==true)
            System.out.println("mila");
        else System.out.println("no Mil gya");
    }
}
/*package Array;
YE EK INTEGER ME CHECK MARK MARKE KARNE KA TARIKA HAI
public class Linearsearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 23, 41, 53};
        int x = 4;
        int flag = -1;// means target array me nahi hai
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                flag = i;//any number except -1 array me hai
                break;
            }
        }
        if(flag!=-1)
            System.out.println("mila at index"+i);
        else System.out.println("no Mil gya");
    }
}
*/


