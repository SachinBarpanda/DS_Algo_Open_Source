package Lec10;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Rotate_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotatearray(arr, k);
        for(int i : arr){
            System.out.println(i);
        }
    }

    private static void rotatearray(int[] arr, int k) {
        k%=arr.length;
        int [] arr2 = new int[arr.length];
        int j = 0;
        for (int i = arr.length-k; i < arr.length; i++,j++) {
            arr2[j] = arr[i];
        }
        for (int i = 0; i < arr.length-k; i++,j++) {
            arr2[j] = arr[i];
        }
        int p = 0;
        for(int i : arr2){
            arr[p++] = i;
        }
    }

}
