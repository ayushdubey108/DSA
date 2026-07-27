package Linkedlist;
class DataNode{
    int val, idx;
    DataNode next;
    DataNode(int val){
        this.val = val;
    }
}
class LinkList { // user defined data structure
    DataNode head; // null
    DataNode tail; // null what i talk about is this
    int size;
    int search(int val){
        if(head==null) return -1;
        DataNode temp = head;
        int idx = 0;
        while(temp != null) {
            if (temp.val == val) return idx;
                temp = temp.next;
                idx++;
        }
        return -1;
    }

    void addAtHead(int val){
        DataNode temp = new DataNode(val);
        if(head == null) {
            head = tail = temp;
        }else{
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void addAtTail(int val){
        DataNode temp = new DataNode(val);
        if(tail == null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void deleteAtHead(int val){
        DataNode temp = new DataNode(val);
        if(head == null) {
            System.out.println("List Is Empty!");
            return;
        }
        head = head.next;
        if(head==null) tail = null; // THIS CASE IS FOR ONE SIDE ARRAY
        size--;
    }

    void display(){
        if(head == null) return;
        DataNode temp = head;
        while(temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    int get(int idx){
        DataNode temp = head;
        for (int i = 0; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    void insert(int val, int idx) {
        if (idx < 0 || idx > size)
            System.out.println("Invalid Index!");

        else if (idx == 0)
            addAtHead(val);

        else if (idx == size)
            addAtTail(val);

        else {
            DataNode temp = head;
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }

            DataNode t = new DataNode(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
    }

    void delete(int idx){
        if(idx<0 || idx >= size){
            System.out.println("Invalid Index");
            return;
        }
        DataNode temp = head;
        for (int i = 1; i <=idx-1 ; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next; // delete
        if(idx == size-1) tail = temp;
        size--;
    }
}
public class LinkedListDataStructure {
    public static void main(String[] args) {
        LinkList l1 = new LinkList();
        l1.addAtTail(10);
        l1.addAtTail(20);
        l1.addAtTail(30);
        l1.addAtTail(40);
        l1.display();

        l1.addAtHead(44);
        l1.display();
        l1.addAtHead(684);
        l1.display();
        l1.deleteAtHead(684);
        l1.display();
        System.out.println(l1.size);
        l1.insert(40,2);
        l1.display();
        //System.out.println(l1.get(4));
        l1.delete(2);
        l1.display();
        
        System.out.println(l1.search(40));
    }
}
