package Lec3;

import java.util.Scanner;

public class Pattern_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stars = n/2+1;
        int space = -1;
        int rows = 1;
        while(rows<=n){
            int i = 1;
            while(i <= stars){
                System.out.print("* ");
                i++;
            }
            int j = 1;
            while(j <= (space)){
                System.out.print("  ");
                j++;
            }
            int k =1 ;
            if(rows==1 || rows==n){
                k =2;
            }
            while(k<=stars){
                System.out.print("* ");
                k++;
            }
            if(rows<(n/2)+1){
                stars--;
                space+=2;
            }else{
                stars++;
                space-=2;
            }
            rows++;
            System.out.println();
        }
    }
}
