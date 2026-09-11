class DataNode {
    int val;
    DataNode next;
    DataNode(int val) {
        this.val = val;
    }
}

class LinkedList {
    DataNode head;
    DataNode tail;
    int size;

    void addAtHead(int val) {
        DataNode temp = new DataNode(val);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }

        size++;
    }

    void addAtTail(int val){
        DataNode temp = new DataNode(val);
        if(tail == null) head  = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
    }

    void display() {
        DataNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();

        l1.addAtHead(40);
        l1.addAtTail(45);
        l1.display();
    }
}