package Lec60;

import java.util.Arrays;
import java.util.Scanner;

public class ValentineMagic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] boys = new int[sc.nextInt()];
        int[] girls = new int[sc.nextInt()];
        for (int i = 0; i < boys.length; i++) {
            boys[i] = sc.nextInt();
        }
        for (int i = 0; i < girls.length; i++) {
            girls[i] = sc.nextInt();
        }
        int[][]dp = new int[boys.length][girls.length];
        Arrays.sort(boys);
        Arrays.sort(girls);
        System.out.println(valentine(boys,girls,0,0,dp));
    }
    public static int valentine(int [] boys , int [] girls , int i , int j,int[][]dp){
        if(i==boys.length){
            return 0 ;
        }
        if(j==girls.length){
            return 999999;
        }
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        int pair = valentine(boys,girls,i+1,j+1,dp)+Math.abs(boys[i] - girls[j]);
        int unpair = valentine(boys , girls , i , j+1,dp);

        return dp[i][j] = Math.min(pair , unpair);
    }
}
