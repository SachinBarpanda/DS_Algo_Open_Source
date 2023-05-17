package Lec3;

import java.util.Scanner;

public class Pattern_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = ((2*n)-1);
        int rows = 1;
        int stars = 1;
        while(rows <= n1){
            int i = 1;
            while(i<=stars){
                System.out.print("* ");
                i++;
            }
            rows++;
            if(rows>5){
                stars--;
            }else{
                stars++;
            }

            System.out.println();
        }
    }
}
