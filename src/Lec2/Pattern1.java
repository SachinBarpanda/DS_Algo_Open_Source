package Lec2;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rows = 1;
        int stars = n;
        while(rows<=n){
            int i = 1 ;
            while(i<=stars){
                System.out.print("* ");
                i++;
            }
//            then think about the next row
            rows++;
            System.out.println();
        }
    }
}
