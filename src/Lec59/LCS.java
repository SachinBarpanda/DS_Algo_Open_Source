package Lec59;

import java.util.Arrays;

public class LCS {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ace";

        int [][] dp = new int[str1.length()][str2.length()];
        for(int [] a : dp){
            Arrays.fill(a,-1);
        }
//        System.out.println(lcs(str1,str2,0,0,dp));
        System.out.println(lcsBottomUp(str1,str2));
    }
    public static int lcs(String s1 , String s2 , int i , int j, int [][] dp){
        if(i >= s1.length() || j >= s2.length()){
            return 0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int ans = 0;
        if(s1.charAt(i) == s2.charAt(j)){
            ans = 1 + lcs(s1,s2,i+1,j+1,dp);
        }
        else{
            int right = lcs(s1, s2 , i+1, j,dp);
            int left =  lcs(s1, s2 , i, j+1,dp);
            ans = Math.max(left,right);
        }
        return dp[i][j] = ans;
    }
    public static int lcsBottomUp(String s1 , String s2){
        int[][]dp = new int[s1.length()+1][s2.length()+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        Arrays.fill(dp[0], 0);

        for (int i = 0; i < dp.length-1; i++) {
            for (int j = 0; j < dp[0].length-1; j++) {
                if(s1.charAt(i)==s2.charAt(j)){
                    dp[i+1][j+1] = dp[i][j]+1;
                }else{
                    dp[i+1][j+1] = Math.max(dp[i][j+1],dp[i+1][j]);
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }
}
