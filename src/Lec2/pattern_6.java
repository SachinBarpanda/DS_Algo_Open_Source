package Lec2;

import java.util.Scanner;

public class pattern_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = 0 ;
        int star = n;
        int row = 1;
        while(row<=n){
            int i = 1;
            while(i<=space*2){
                System.out.print("  ");
                i++;
            }
            space ++;
            int j = 1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            star--;
            System.out.println();
            row++;
        }
    }
}
