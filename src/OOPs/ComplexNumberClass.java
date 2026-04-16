package OOPs;

class ComplexNumber {
    int x;
    int y;
    ComplexNumber(int x, int y){
        this.x = x;
        this.y = y;
    }
    ComplexNumber(){}
    void print(){
        if(y>=0) System.out.println(x+" + "+y+"i");
        else System.out.println(x+" - "+(-y)+"i");
    }

    void add(ComplexNumber z){
        x += z.x;
        y += z.y;
    }

    void multiply(ComplexNumber z){
        x = x*z.x - y*z.y;
        y = x*z.y + y*z.x;
    }

    void divide(ComplexNumber z){
         x = (x * z.x + y * z.y) / (z.x * z.x + z.y * z.y);
         y = (y * z.x - x * z.y) / (z.x * z.x + z.y * z.y);
    }

}
public class ComplexNumberClass {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(2,-5);
        ComplexNumber z2 = new ComplexNumber(6,4);
        z1.print();
        z2.print();
        z1.add(z2);
        z1.print(); z2.print();
        z1.multiply(z2);
        z1.print(); z2.print();
        z1.divide(z2);
        z1.print(); z2.print();

    }
}
