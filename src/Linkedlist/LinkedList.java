package Linkedlist;
class ListNode {
    int val;
    ListNode next; // Here node is a Data Type for next variable
    ListNode(int val) {
        this.val = val;
    } // ye line uske liye h jo andr dala hu brckt me val
}
public class LinkedList {
    public static void main(String[] args) {
        ListNode a = new ListNode(10); // Head Node
        ListNode b = new ListNode(20); // I SAY a.val = 10;
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(40);
        ListNode e = new ListNode(50);
        //System.out.println(a.next);
        // Connect karenge(Link karenge)
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
// THESE BELOW ALL sout TELLS ABOUT HOW ABOVE NEXT NODES WERE LINKED TOGETHER!!!!!
        System.out.println(a);
        System.out.println(b);// it tells that both are same
        System.out.println(a.next);// this is also same like "above" sout(a) & sout(b);
        System.out.println(c);
        System.out.println(b.next);
        System.out.println(a.next.next);
        System.out.println(a.next.next.val);
    }
}
