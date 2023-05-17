package Lec58;

import java.util.Arrays;

public class Min_Cost_Climbing_Stairs {
    public static void main(String[] args) {
        int [] cost = {1,100,1,1,1,100,1,1,100,1};
        int [] dp = new int[cost.length];
        Arrays.fill(dp,-1);
        int i =  climbing(0,cost,dp);
        int j =  climbing(1,cost,dp);
        System.out.println(climbingBottomUp(cost));
//        System.out.println(Math.min(i,j));
    }
    public static int climbing(int i , int [] cost , int[] dp ){
        if(i>=cost.length){
            return 0;
        }

        if(dp[i]!=-1){
            return dp[i];
        }

        int single = climbing(i+1, cost ,dp);
        int double1 = climbing(i+2, cost , dp);
        return dp[i] = Math.min(single,double1)+cost[i];
    }

    public static int climbingBottomUp(int []cost ){
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.min(dp[i-1],dp[i-2])+cost[i];
        }
        return Math.min(dp[cost.length-1],dp[cost.length-2]);
    }
}
