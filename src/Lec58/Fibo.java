package Lec58;

import jdk.swing.interop.SwingInterOpUtils;

public class Fibo {
    public static void main(String[] args) {
        int n = 80000;
        int [] dp = new int[n+1];

        long start1 = System.nanoTime();
//        System.out.println(fib(n,dp));
        long end1 = System.nanoTime();
        System.out.println("Time for DP solution : " +String.format("%,d", (end1-start1))  + "ns");




        start1 = System.nanoTime();
//        System.out.println(nonDpFibo(n));
        System.out.println(fibBottomUp(n));
        end1 = System.nanoTime();
        System.out.println("Time for NON - DP solution : "  +String.format("%,d", (end1-start1))  + "ns");
    }
    public static int nonDpFibo(int n ){
        if(n==0 || n==1){
            return n;
        }
        return nonDpFibo(n-1)+nonDpFibo(n-2);
    }
    public static int fib(int n, int [] dp ){
        if(n==0 || n == 1 ){
            return n ;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int f1 = fib(n-1,dp);
        int f2 = fib(n-2,dp);
        return dp[n]=f1+f2;
    }
    public static int fibBottomUp(int n ){
        int[] dp = new int[n+1];
//        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2 ; i < dp.length ; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n] ;
    }
}
