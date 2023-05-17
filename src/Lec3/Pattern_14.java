package Lec3;

import java.util.Arrays;

public class Pattern_14 {
    public static void main(String[] args) {
        int n = 5;
        int space = n-1;
        int stars = 1;
        int rows = 1;
        while(rows <= 2*n ){
            int i = 1;
            while(i<= space){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while(j <= stars){
                System.out.print("* ");
                j++;
            }
            if(rows < n){
                stars++;
                space--;
            }else{
                stars--;
                space++;
            }
            rows++;
            System.out.println();
        }
    }
}
