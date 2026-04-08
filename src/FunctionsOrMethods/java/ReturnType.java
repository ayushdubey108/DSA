package FunctionsOrMethods.java;

public class ReturnType {
    public static int sum(int a, int b){
        System.out.println("Hi");
        return a+b;
    }
    public static void main(String[] args) {
        //System.out.println(sum(2,8)); //AISA KRNE SE YE a aur b ITSELF ME EK VALUE FORM KARENGE
        System.out.println(sum(5,8));
        sum(5,8);//ye keval bateyga ki total 13 hai ab uska kya karna ye maine nhi bataya isiliye ye print nhi krega.

    }// aur iska sum call laga raha hai.
}
