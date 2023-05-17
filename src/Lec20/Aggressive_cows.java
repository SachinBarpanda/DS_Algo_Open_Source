package Lec20;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_cows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int nos = sc.nextInt();
            int noc = sc.nextInt();
            int[] stall = new int[nos];
            for(int i= 0; i < stall.length;i++){
                stall[i] = sc.nextInt();
            }
            Arrays.sort(stall);
            System.out.println(largestMinDist(stall,noc));
        }
    }
    public static int largestMinDist(int[] stall, int noc){
        int low = 0;
        int n = stall.length;
        int high = stall[n-1] - stall[0];
        int ans =0 ;
        while(low <= high){
            int mid = (low +high)/2;
            if(isPossible(stall,noc,mid)){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] stall, int noc, int mid) {
        int i =1;
        int n = stall.length;
        int cow = 1;
        int pos = stall[0];
        while(i < n ){
            if((stall[i] - pos) >=mid){
                cow++;
                pos = stall[i];
            }
            i++;
        }
       return cow>=noc;
    }
}
