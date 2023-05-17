package Lec10;

import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int item = sc.nextInt();
        System.out.println(linear_search(arr, item));
    }

    private static int linear_search(int[] arr, int item) {
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] == item){
                return i;
            }
        }
        return -1;
    }
}
