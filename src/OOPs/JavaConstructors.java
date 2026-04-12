package OOPs;
//below is main class
public class JavaConstructors {
    int modelYear; // create a class attribute
    String modelName;

    // create a class contructor for the Main class
    public JavaConstructors(int year, String name){
        modelYear = year;
        modelName = name; // Set the initial value for the class attribute x
    }

    public static void main(String[] args) {
        JavaConstructors myCar = new JavaConstructors(1969, "Bentley");// Create an object of class Main (This will call the constructor)
        System.out.println(myCar.modelYear + " " + myCar.modelName); // print the value of x
    }
}
