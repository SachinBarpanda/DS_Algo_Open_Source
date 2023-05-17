package Lec58;

import java.util.Arrays;

public class Longest_Increasing_Subsequence {
    public static void main(String[] args) {
        int [] nums = {10,9,2,5,3,7,101,18};
        System.out.println(longestSequence(nums));
    }

    private static int longestSequence(int[] nums) {
        int [] dp = new int[nums.length];
        Arrays.fill(dp,1);
        for (int i = 1; i < nums.length; i++) {
            for (int j = i-1; j >= 0 ; j--) {
                if(nums[j]<nums[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int max = dp[0] ;
        for (int i = 0; i < dp.length-1; i++) {
            if(max<dp[i+1]){
                max = dp[i+1];
            }
        }
        return max;
    }
}
