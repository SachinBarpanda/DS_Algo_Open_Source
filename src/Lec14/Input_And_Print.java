package Lec14;

import java.util.Scanner;

public class Input_And_Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0 ; i < arr.length;i++){
            for(int j = 0 ; j < arr[0].length;j++){
                arr[i][j] =  sc.nextInt();
            }
        }
        display(arr);
    }

    private static void display(int[][] arr) {

        for(int i = 0 ; i < arr.length;i++){
            for(int j = 0 ; j < arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
