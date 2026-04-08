package PatternPrinting;
import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows and columns : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                System.out.print(j);// ISME j INC HO RHA HAI AND i(ROW) SAME HAI AND& (i) hota it means i badh rha h and j same h.
            }// agr i hota to 111,,,,222,,,333 aise format me print hota
            System.out.println();
        }
    }
}
