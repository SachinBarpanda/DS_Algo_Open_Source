package Lec60;

import java.util.Arrays;

public class Coin_Change_II {
    public static void main(String[] args) {
        int[] coin = {1, 2, 5};
        int amount = 5;
        int[][] dp = new int[coin.length][amount + 1];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
//        System.out.println(coinChange(coin, amount, 0, dp));
        System.out.println(coinChangeBottomUp(coin,amount));
    }

    public static int coinChange(int[] coin, int amount, int i, int[][] dp) {
        if (amount == 0) {
            return 1;
        }
        if (i == coin.length) {
            return 0;
        }
        if (dp[i][amount] != -1) {
            return dp[i][amount];
        }

        int inc = 0;
        int exc = 0;
        if (amount >= coin[i]) {
            inc = coinChange(coin, amount - coin[i], i, dp);
        }
        exc = coinChange(coin, amount, i + 1, dp);
        return dp[i][amount] = inc + exc;
    }
    public static int coinChangeBottomUp(int [] coin , int amount){
        int[] [] dp = new int[coin.length][amount+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }
        for (int i = dp.length-1 ; i >= 0 ; i--){
            for(int j = 1 ; j < dp[0].length ; j++){
                int change = 0;
                int notChange = 0;
                if(j-coin[i]>=0) {
                    change = dp[i][j - coin[i]];
                }
                if(i+1<coin.length) {
                    notChange = dp[i + 1][j];
                }
                dp[i][j] = change + notChange;
            }
        }
        return dp[0][amount];

    }
}
