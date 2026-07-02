package CODEFORCES;
import java.util.Scanner;

public class A281 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.charAt(0) == Character.toLowerCase(s.charAt(0))){
            System.out.println(Character.toUpperCase(s.charAt(0)) + s.substring(1));
        }
        else{
            System.out.println(s);
        }
    }
}
