//package OOPs;
//
//public class Attributes {
//    int x = 5;// final int x = 10;
//    public static void main(String[] args){
//        Attributes myObj1 = new Attributes();
//        Attributes myObj2 = new Attributes();
//        myObj2.x = 25;
//        System.out.println(myObj1.x);
//        System.out.println(myObj2.x);
//}
//}
package OOPs;

public class Attributes {

String fname = "Ayush";
String lname = "Dubey";
int age = 20;

public static void main(String[] args) {
    Attributes myObj = new Attributes();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Age: " + myObj.age);
}
}