package Leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roman Numeral: ");
        String s = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));
            if (i < s.length() - 1) {
                int next = map.get(s.charAt(i + 1));
                if (current < next) {
                    sum -= current;
                } else {
                    sum += current;
                }

            } else {
                sum += current;
            }
        }
        System.out.println("Integer = " + sum);
        //sc.close();
    }
}