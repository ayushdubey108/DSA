package FunctionsOrMethods.java;

public class ScopeofVariable {
    public static void main(String[] args) {
        int i;
        for(i=1;i<=5;i++){
            System.out.println(i+" ");//Ye i iska local hai isi me defined hai
        }
        System.out.println("*"+i+"*");
    }
}
