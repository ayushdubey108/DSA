package Loops;
//import java.util.Scanner;
public class Print19Table {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        for(int i=19; i<=200; i=i+19){//i+=19
            if(i%19==0){
                System.out.print(i+" ");
            }
        }
    }
}
