package Lec9;

import java.util.Scanner;

import static Lec9.Arrays_Demo.display;

public class User_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        display(arr);
    }

}
