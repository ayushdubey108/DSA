package OOPs;

import java.util.Scanner;

public class PrivateKeyword {
    public static class Students{
        String name = "Dubeyji";// agr yha pr name initialize nhi kia hu like ki kisi ka name nhi likha hu tb asa hoga to "null" hoga
        private int rno; // ham isko change ya kuch bhi write nhi kr skte // 0.
        double gpa; // 0.0
        void print(){ // getter
            System.out.println(name+" "+gpa+" "+rno);
        }
        int getRno(){ // getter
            return rno;
        }
        void setRno(int x){ //setter
            rno = x;
        }
//        public void p(){
//            print();
//        }
//
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Students s1 = new Students();
        //s1.p();
        //System.out.println(s1.name);
        s1.print();
        s1.gpa = 8.9;
        s1.name = "ayush";
        // s1.rno = 45; let it is giving an error
        s1.setRno(45);
        System.out.println(s1.getRno());

        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);

    }
}
