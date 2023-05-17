package Lec61;

public class Minimum_Falling_Path_SumII {
    public static void main(String[] args) {
        int[][] matrix = {{-19,57},{-40,-5}};
        int ans = Integer.MAX_VALUE;
        int [][] dp = new int[matrix.length][matrix[0].length];
//        for(int [] i : dp){
//            Arrays.fill(i,Integer.MAX_VALUE);
//        }
        for (int i = 0; i < matrix[0].length; i++) {
            ans = Math.min(ans,fallingPathSumII(matrix,0,i,dp));
        }
        System.out.println(ans);
    }
    public static int fallingPathSumII(int[][] matrix , int cr ,int cc , int[][] dp){
        if(cc<0 || cc>=matrix[0].length){
            return Integer.MAX_VALUE;
        }

        if(cr == matrix.length-1){
            return matrix[cr][cc];
        }
//        if(dp[cr][cc] != Integer.MAX_VALUE){
//            return dp[cr][cc];
//        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < matrix[0].length ; i++) {
            if(i!=cc){
                ans = Math.min(ans,fallingPathSumII(matrix, cr + 1, i,dp));
            }
        }

        return dp[cr][cc] =  matrix[cr][cc] + ans;
    }
}
