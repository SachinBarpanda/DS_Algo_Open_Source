package Lec19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sum_Of_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i < n ;i++){
            arr1[i] =sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i = 0; i < m ;i++) {
            arr2[i] =sc.nextInt();
        }
        sumOfTwo(arr1,arr2);
    }

    private static void sumOfTwo(int[] arr1, int[] arr2) {
        int n = arr1.length-1;
        int m = arr2.length-1;
        int carry = 0;
        ArrayList<Integer>list = new ArrayList<>();
        while((n>=0) || (m>=0)) {
            int sum = 0;
            if(n>=0) {
                sum += arr1[n];
                n--;
            }

            if(m>=0) {
                sum += arr2[m];
                m--;
            }
            sum+=carry;
            carry = sum/10;
            list.add(sum%10);
        }
        if(carry>0){
            list.add(carry);
        }
        Collections.reverse(list);
        for(int i : list){
            System.out.print(i+", ");
        }
        System.out.print("END");
    }
}
