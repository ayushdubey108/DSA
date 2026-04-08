package BasicsOfJava;

public class DoubleDataType {
    public static void main(String[] args) {
        // OPERATION 1 FOR UNDERSTANDING
        double x = 2;
        double y = 3;
        double z = x/y; // isme dabbe bna kr consider kar rha hai
        //double z = 2/3; // Through this operation, different operation is coming because in this the computer cosider 2 and 3 as a integer so int/int = int.
        System.out.println(z);

        // OPERATION 2 FOR UNDERSTANDING
        double m = 5;
        double n = 4;
        System.out.println(m+n);
        System.out.println(m-n);
        System.out.println(m/n);
        System.out.println(m*n);

        // OPERATION 3 FOR UNDERSTANDING
        double radius = 5;
        double pie = 3.1415;
        double Area = (pie * radius * radius);
        System.out.println(Area);
    }
}
