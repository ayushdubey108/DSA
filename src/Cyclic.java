import java.util.Scanner;

public class Cyclic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        char[] arr = n.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            int digit = arr[i] - '0';
            if (i == 0 && digit == 9) {
                continue;
            }

            if (digit > 4) {
                digit = 9 - digit;
            }

            arr[i] = (char)(digit + '0');
        }

        System.out.println(new String(arr));
    }
}
