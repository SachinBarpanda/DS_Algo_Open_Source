package Lec58;

import java.util.Arrays;

public class House_Robber {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int [] dp = new int[nums.length];
        Arrays.fill(dp,-1);
//        System.out.println(houseRobberMonuBhaiya(nums, 0 , 0 , dp));
        System.out.println(robberBottomUp(nums));
    }

    private static int houseRobber(int[] nums ,int i,  int sum , int [] dp) {
        if(i>=nums.length){
            return sum;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int rob = houseRobber(nums,i+2,sum+nums[i],dp);
        int didNotRob = houseRobber(nums,i+1,sum,dp);

        return dp[i] =  Math.max(rob,didNotRob);
    }

    private static int houseRobberMonuBhaiya(int[] nums ,int i,  int sum , int [] dp) {
        if(i>=nums.length){
            return sum;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int rob = houseRobberMonuBhaiya(nums,i+2,sum,dp)+nums[i];
        int didNotRob = houseRobberMonuBhaiya(nums,i+1,sum,dp);

        return dp[i] =  Math.max(rob,didNotRob);
    }
    public static int robberBottomUp(int[] nums){
        int [] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < dp.length ; i++) {
            int rob = nums[i] + dp[i-2];
            int notRob =  dp[i-1];
            dp[i] = Math.max(rob,notRob);
        }

        return dp[nums.length-1];
    }
}
