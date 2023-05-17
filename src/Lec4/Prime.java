package Lec4;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        while(i<n){
            if(n%i==0){
                i=n+1;
                System.out.print("Not - Prime");
            }
            i++;
        }
        if(i==n){
            System.out.println("Prime");
        }

    }
}
