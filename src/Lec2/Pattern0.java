package Lec2;

import java.util.Scanner;

public class Pattern0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1 ;
        while(i<=n){
            System.out.print("* ");
            i++;
        }
    }
}
