package Lec8;

import java.util.Scanner;

public class Armstorng_With_Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n = n1;
        int size = count(n);

        System.out.println(armstrong(n1 ,size));
    }

    private static int count(int n) {
        int size =0 ;
        while(n>0){
            size++;
            n/=10;
        }
        return size;
    }

    public static boolean armstrong(int n, int size){
        int num = 0;
        int num1 = n;
            while(n>0){
                int rem = n%10;
                num += Math.pow(rem,size);
                n/=10;
            }
        return num == num1;
    }
}
