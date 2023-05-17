package Lec61;

import java.util.Arrays;

public class Min_Falling_Path_Sum {
    public static void main(String[] args) {
        int[][] matrix = {{-19,57},{-40,-5}};
        int ans = Integer.MAX_VALUE;
        int [][] dp = new int[matrix.length][matrix[0].length];
//        for(int [] i : dp){
//            Arrays.fill(i,Integer.MAX_VALUE);
//        }
        for (int i = 0; i < matrix[0].length; i++) {
            ans = Math.min(ans,fallingPathSum(matrix,0,i,dp));
        }
        System.out.println(ans);
    }
    public static int fallingPathSum(int[][] matrix , int cr ,int cc , int[][] dp){
        if(cc<0 || cc>=matrix[0].length){
            return Integer.MAX_VALUE;
        }

        if(cr == matrix.length-1){
            return matrix[cr][cc];
        }
//        if(dp[cr][cc] != Integer.MAX_VALUE){
//            return dp[cr][cc];
//        }
        int down = fallingPathSum(matrix, cr+1,cc,dp);
        int left = fallingPathSum(matrix, cr + 1, cc - 1,dp);
        int right = fallingPathSum(matrix, cr+1,cc+1,dp);

        return dp[cr][cc] =  matrix[cr][cc] + Math.min(down,Math.min(left,right));
    }
}
