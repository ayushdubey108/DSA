package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKelements {
    static void main() {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        q = reverseK(q,3);
        System.out.println(q);
    }
    public static Queue<Integer> reverseK(Queue<Integer> q, int k) {
        Stack<Integer> st = new Stack<>();// sbse pehle stack bnao
        int n = q.size();
         for(int i=1;i<=k;i++){
             while(!q.isEmpty()){
                 st.push(q.remove());
             }
         }
        while (st.size() > 0) {
            q.add(st.pop());
        }
        for(int i=1;i<=n-k;i++){
            q.add(q.remove());
        }
        return q;
    }
}
