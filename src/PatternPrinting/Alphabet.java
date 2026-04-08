package PatternPrinting;
import java.util.Scanner;
public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns : ");
        int n = sc.nextInt();
        System.out.print("Enter rows : ");
        int m = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=m; j++){
                System.out.print(" "+(char)(j+64));
            }
            System.out.println();
        }
    }
}
