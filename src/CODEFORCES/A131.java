package CODEFORCES;

import java.util.Scanner;

public class A131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        if(s.equals(s.toUpperCase())){
            System.out.println(s.toLowerCase());
        } else if(Character.isLowerCase(s.charAt(0)) &&
                s.substring(1).equals(s.substring(1).toUpperCase())){
            String result = Character.toUpperCase(s.charAt(0)) +
                    s.substring(1).toLowerCase();
            System.out.println(result);
        }
        else{
            System.out.println(s);
        }
    }
}
