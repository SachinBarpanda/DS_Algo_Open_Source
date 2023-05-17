package Lec4;

import java.util.Scanner;

public class Break_Using_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        while(i < n){
            if(n%i==0){
                System.out.print("Not Prime");
                break;
            }
        }
        if(i==n){
            System.out.println("Prime");
        }
    }
}
