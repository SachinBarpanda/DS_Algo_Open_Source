package Lec15;

import java.util.Scanner;

public class Divisible_Subarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0 ; i < n ; i++){
                a[i] = sc.nextLong();
            }
            long n1 = goodSum(a);
            System.out.println(n1);
            t--;
        }
    }

    private static long  goodSum(long[] arr) {
        int i = 0;
        int n = arr.length;
        long[] freq = new long[n];
        freq[0] = 1;
        int tSum = 0;
        int idx = 0;
        while(i<n) {
            tSum += arr[i];
            idx = tSum % n;
            if(idx<0){
                idx+=n;
            }
            freq[idx] = freq[idx]+1;
            i++;
        }

        //permutation
        long sum1 = 0 ;
        for(int j = 0 ; j < n ; j++){
            if(freq[j] >=2) {
                sum1 += (freq[j] * (freq[j] - 1)) / 2;
            }
        }
        return sum1;
    }
}
