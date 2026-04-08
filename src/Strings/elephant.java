package Strings;

import java.util.Scanner;
public class elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0;
        int i = 0;
        while(i < x){
            if(i+5 <= x){
                i = i+5;
            }
            else if(i+4 <= x){
                i = i+4;
            }
            else if(i+3 <= x){
                i = i+3;
            }
            else if(i+2 <= x){
                i = i+2;
            }
            else if(i+1 <= x){
                i = i+1;
            }
            count++;
        }
        System.out.println(count);
    }
}




//        int x = sc.nextInt();
//        int moves = (x + 4) / 5;
//        System.out.println(moves);
