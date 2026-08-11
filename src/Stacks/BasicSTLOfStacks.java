package Stacks;

import java.util.Stack;

public class BasicSTLOfStacks {
    public static void main(String[] args) {
        Stack<String> st = new Stack <>();
        System.out.println(st.isEmpty());
        System.out.println(st.size()==0);
        //       System.out.println(st.peek());
//        st.pop(); // condition of Underflow as stack is empty
        st.push("Ayush");
        st.push("Sahil");
        st.push("Isha");
        st.push("Ayisha");
        System.out.println(st.size());
        System.out.println(st);// it takes Aux space = O(n)
        st.pop();
        System.out.println(st+ " "+st.size());
        System.out.println(st.peek());
        System.out.println(st.pop()); // it returns the topmost element and then removes it
        String s = st.pop();
    }
}
