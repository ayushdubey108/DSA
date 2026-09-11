package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TraverseInQueue {
    private static void display(Queue<Integer> q){
        int n = q.size();
        for (int i = 0; i < n; i++) {
            System.out.print(q.peek() + " ");
            q.add(q.remove());
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1); q.add(3); q.add(5); q.add(8); q.add(9);
        display(q);
        addAtIndex(q,2,60);
        display(q);
        remove(q,3);
        display(q);
        System.out.println(peek(q,4));
        display(q);

    }

    private static void addAtIndex(Queue<Integer> q, int idx, int val) {
        if(idx<0 || idx> q.size()) {
            System.out.println("Invalid Index!");
            return;
        }
        int n = q.size();
        if(idx<n){
            for(int i=1;i<=idx;i++){
                q.add(q.remove());
            }
        }
        q.add(val);
        for (int i = 1; i <= n-idx; i++) {
            q.add(q.remove());
        }
    }

    private static int peek(Queue<Integer> q, int idx){
        if(idx<0 || idx>= q.size()) {
            System.out.println("Invalid Index!");
            return -1;
        }
        int n = q.size();
        for(int i=1;i<=idx;i++){
            q.add(q.remove());
        }
        int ans = q.peek();
        for(int i=1;i<=n-idx;i++){
            q.add(q.remove());
        }
        return ans;
        // I completed this by my own

    }

    private static int remove(Queue<Integer> q, int idx){
        if(idx<0 || idx>= q.size()) {
            System.out.println("Invalid Index!");
            return -1;
        }
        int n = q.size();
        for(int i=1;i<=idx;i++){
            q.add(q.remove());
        }
        int ans = q.remove();
        for(int i=1;i<=n-idx;i++){
            q.add(q.remove());
        }
        return ans;

    }
}
