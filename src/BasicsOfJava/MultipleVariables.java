package BasicsOfJava;

public class MultipleVariables {
    public static void main(String[] args) {
        int x,y,z,k;
        x = 8;
        y = 8;
        z = 12;
        k = 24;
        System.out.println(x);
        y = z/x;
        System.out.println(y);
        z = k/x;
        System.out.print("The value of z is : "); //line no. 14&15 defines how to write the value in the defition form.
        System.out.println(z);
        System.out.println("The value of k is : "+k); //Now if i have to write the definition line code in single format then write like this way.
        System.out.println("The value of x+y+z+k is :"+(x+y+z+k));//if i have to write the summation definition code then write like this format only.
        System.out.println(x+y+z+k+" is the total summation of x+y+z+k");
        System.out.println("Hello Ayush!"+"Hello Dubeyji");
    }
}
