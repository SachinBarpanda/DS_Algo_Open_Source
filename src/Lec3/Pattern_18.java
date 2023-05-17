package Lec3;

import java.util.Scanner;

public class Pattern_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n/2;
        int star = 1;
        int rows = 1;
        while(rows <= n){
            int i = 1;
            while(i <= space){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while(j <= ((2*star)-1)){
                System.out.print("* ");
                j++;
            }
            if(rows<((n+1)/2)){
                space--;
                star++;
            }else{
                space++;
                star--;
            }
            rows++;
            System.out.println();
        }
    }
}
