package Loops;

public class ContinueStatement {
    public static void main(String[] args) {
        // 2 3 4 6 8 9...
//        for(int i=1; i<=100; i++){
//            if(i==12 || i==13) continue; // YE HATANE KE KAAM AATA HAI KOI KO KISI GROUP ME SE.
//            if(i%2==0 || i%5==0 )
//                System.out.println(i);
//        }
        for(int i=1; i<=100; i++){
            if(i%2==1) continue; //
            System.out.println(i);
        }
    }
}
