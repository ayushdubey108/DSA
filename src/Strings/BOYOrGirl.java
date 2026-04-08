package Strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BOYOrGirl {
    public static void main(String[] args) {
        Set<Character> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        for (char ch : s.toCharArray()) {
            set.add(ch);
        }
        if(set.size() % 2 == 0 ) {
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
}
