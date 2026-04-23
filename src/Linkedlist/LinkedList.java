package Linkedlist;
class Node{
    int val;
    Node next; // Here node is a Data Type for next variable
    Node(int val) {
        this.val = val;
    }
}
public class LinkedList {
    public static void main(String[] args) {
        Node a = new Node(10); // Head Node
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
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
    }
}
