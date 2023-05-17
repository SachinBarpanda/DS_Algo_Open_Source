package Lec4;

import java.util.Scanner;

public class GCHYaHCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int divident = n1;
        int divisor = n2;

        while(divident%divisor!=0){
            int rem = divident% divisor;
            divident = divisor;
            divisor = rem;
        }
        System.out.println("HCF is : "+divisor);
    }
}
