package OOPs;

public class JavaClassMethods {
    static void fullThrottle(){
        System.out.println("My favourite car is Bentley");
    }

    static void speed(int maxspeed){
        System.out.println("My car speed is : "+maxspeed);
    }

    public static void main(String[] args) {
        JavaClassMethods myCar = new JavaClassMethods();
        myCar.fullThrottle();
        myCar.speed(500);
    }
}
