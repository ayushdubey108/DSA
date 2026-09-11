package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {
    static void main() {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2); q.add(3);
        q.add(4); q.add(5);
        System.out.println(q);
        q = reverseQueue(q);
        System.out.println(q);
    }
    public static Queue<Integer> reverseQueue(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty()){ // while(q.size()>0 jb tk q empty NAHI hai!!!
            st.push(q.remove()); //tb tk st me push kro jisko tmne q se remove kia hai
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        return q;
    }
}
