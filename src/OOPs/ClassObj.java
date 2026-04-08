package OOPs;

import java.util.Scanner;

public class ClassObj {
    // CLASS BANA LO AISE KAR KE!!!!!!!!!!!!!!!!!!
    public static class Student{ // khud ka ek data type bna liya hai hamne
        String name;
        int rno;
        double gpa;

        public void print() {
            System.out.println(name+ " " + rno+" "+ gpa);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // ye maine object bnaya hai
        Student s1 = new Student(); // declaration
        s1.name = "ayushdubey" ;
        s1.rno = 43;
        s1.gpa = 7.2;

        Student s2 = new Student(); // declaration
        s2.name = "JaiHo";
        s2.rno = 34;
        s2.gpa = 8.8;

        Student s3 = new Student(); // declaration
        s3.name = "kama";
        s3.rno = 56;
        s3.gpa = 5.5;

        System.out.println(s1.name+ " " + s1.rno+" "+ s1.gpa); // it is printing the output of above decalred classes
        System.out.println(s2.name+ " " + s2.rno+" "+ s2.gpa);
        System.out.println(s3.name+ " " + s3.rno+" "+ s3.gpa);

        s1.print();
        s2.print();
        s3.print();
    }
}
