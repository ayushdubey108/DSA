package LinkedList;

import java.util.Scanner;

class Node {
    int val;
    Node next; //null
    Node(int val){
        this.val = val;
    }
}
public class DisplayList {
    public static void display(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.println(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListNode a = new ListNode(sc.nextInt()); // VERY IMP FOR RAKING AN INPUT!!
        ListNode b = new ListNode(130);
        ListNode c = new ListNode(16);
        ListNode d = new ListNode(70);
        ListNode e = new ListNode(50);
        ListNode f = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);

    }

}
