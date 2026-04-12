package OOPs;

public class thisKeyword {
    int x;// Class variable x
    // Constructor with one parameter x
    public thisKeyword(int x){
        this.x = x;// refers to the class variable x
    }
    public static void main(String[] args) {
        // Create an object of Main and pass the value 5 to the constructor
        thisKeyword myObj = new thisKeyword(6);
        System.out.println("Value of x = " +myObj.x);

    }
}
