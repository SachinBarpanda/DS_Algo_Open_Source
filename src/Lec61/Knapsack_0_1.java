package Lec61;

import java.util.Arrays;
import java.util.Scanner;

public class Knapsack_0_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int [] wt = new int[n];
        for (int i = 0; i < n; i++) {
            wt[i] = sc.nextInt();
        }
        int [] val = new int[n];
        for (int i = 0; i < n; i++) {
            val[i] = sc.nextInt();
        }
        int[][] dp = new int[n][s+1];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
//        System.out.println(Knapsack(0,wt,val,s,dp));
        System.out.println(knapsackBottomUp(wt,val,s));
    }
    public static int Knapsack(int i ,int [] wt , int [] val , int cap,int[][]dp){
        if(i==wt.length || cap == 0) {
            return 0;
        }
        if(dp[i][cap]!=-1){
            return dp[i][cap];
        }
        int include  = 0;
        int exclude ;
        if(cap>=wt[i]) {
            include = Knapsack(i + 1, wt, val, cap - wt[i],dp) + val[i];
        }
        exclude = Knapsack(i+1,wt,val,cap,dp);
        return dp[i][cap] = Math.max(include,exclude);
    }

    public static int knapsackBottomUp(int [] wt , int[] val , int cap){
        int[][]dp = new int[cap+1][wt.length+1];
        for(int i = 1 ; i < dp.length;i++){
            for(int j = 1 ; j < dp[0].length; j++){
                int include = 0;
                int exclude = 0;
                if(i>=wt[j-1]){
                    include = val[j-1] + dp[i-wt[j-1]][j-1];
                }
                exclude = dp[i][j-1];
                dp[i][j] = Math.max(include,exclude);
            }
        }
        return dp[cap][wt.length];
    }


}
