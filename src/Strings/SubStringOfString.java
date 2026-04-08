package Strings;

public class SubStringOfString {
    public static void main(String[] args) {
        String s = "Jaishah";
        for (int i = 0; i < s.length() ; i++) {
            for (int j = i+1; j <= s.length() ; j++) {
                System.out.print(s.substring(i,j)+ " ");
            }
            System.out.println();
            
        }
        //System.out.println(s.substring(1, s.length()-1));
    }
}
