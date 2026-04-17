package OOPs;

class ArrayList{
    int[] arr;
    int idx = 0;
    int size = 0;
    ArrayList(int capacity){
        arr = new int[capacity];
    }
    void add(int ele){
        arr[idx++] = ele;
        size++;
    }
    int capacity(){
        return arr.length;
    }
    int get(int index){
        return arr[index];
    }
    void display(){
        for(int i = 0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
public class OwnArrayList {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList(8);
        arr.add(10); arr.add(20); arr.add(30);
        System.out.println(arr.size);
        arr.display();
        System.out.println(arr.get(1));
    }
}
