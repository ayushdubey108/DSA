package OOPs;

public class PrivateKeyword {
    public static class Students{
        String name = "Dubeyji";// agr yha pr name initialize nhi kia hu like ki kisi ka name nhi likha hu tb asa hoga to "null" hoga
        private int rno; // ham isko change ya kuch bhi write nhi kr skte // 0.
        double gpa; // 0.0

    }
    public static void main(String[] args) {
        Students s1 = new Students();
        System.out.println(s1.name);
        s1.gpa = 8.9;
        s1.name = "ayush";
    }
}
