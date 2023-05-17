package Lec60;

import java.util.Arrays;
import java.util.Scanner;

public class Edit_distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            int[][] dp = new int[s1.length()][s2.length()];
            for (int[] i : dp) {
                Arrays.fill(i, -1);
            }
//            System.out.println(distance(s1, s2, 0, 0, dp));
            System.out.println(distanceBottomUp(s1,s2));
        }
    }

    public static int distance(String s1, String s2, int i, int j,
                               int[][] dp) {
        if (s1.length() <= i) {
            return s2.length() - j;
        }
        if (s2.length() <= j) {
            return s1.length() - i;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (s1.charAt(i) == s2.charAt(j)) {
            return distance(s1, s2, i + 1, j + 1, dp);
        } else {
            int delete = distance(s1, s2, i + 1, j, dp);
            int insertion = distance(s1, s2, i, j + 1, dp);
            int replace = distance(s1, s2, i + 1, j + 1, dp);
            return dp[i][j] = Math.min(delete, Math.min(insertion, replace)) + 1;
        }
    }
    public static int distanceBottomUp(String s1 , String s2){
        int[][] dp = new int[s1.length()+1][s2.length()+1];

        for (int i = 0; i <= s1.length(); i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i <= s2.length(); i++) {
            dp[0][i] = i;
        }

        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    int delete = dp[i-1][j];
                    int insertion = dp[i][j-1];
                    int replace = dp[i-1][j-1];

                    dp[i][j] = Math.min(delete,Math.min(insertion,replace))+1;
                }
            }
        }
        return dp[s1.length()][s2.length()];

    }
}
