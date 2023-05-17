package Lec2;

import java.util.Scanner;

public class odd_sum_And_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n>0){
            sum+=n;
            n-=2;
        }
        System.out.println(sum);
    }
}
