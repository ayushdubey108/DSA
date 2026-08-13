package Stacks;
import java.util.Stack;

public class RemoveConsecutive {
    public static String removeConsecutive(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (st.isEmpty() || st.peek() != ch) {
                st.push(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "aaaaaabbcccdaa";
        System.out.println(removeConsecutive(s));
    }
}
