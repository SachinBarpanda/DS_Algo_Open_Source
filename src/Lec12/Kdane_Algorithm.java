package Lec12;

import java.util.Scanner;

public class Kdane_Algorithm {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int []arr = new int[n];
//        for (int i = 0; i <n ; i++) {
//            arr[i] = sc.nextInt();
//        }
        int [] arr = {-2,-3,-1,-5};
        int ans = withoutKdaneAlgo(arr);
        int ans1 = kdaneAlgo(arr);
        System.out.println(ans1);
    }

    private static int kdaneAlgo(int[] arr) {
        int sum = 0 ;
        int ans = Integer.MIN_VALUE;
        for(int i : arr){
            sum +=i;
            ans = Math.max(ans,sum);
            if(sum<0){
                sum = 0;
            }
        }
        return ans;
    }
    private static int withoutKdaneAlgo(int[] arr) {
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i ; j < arr.length ; j++){
                sum += arr[j];
                ans = Math.max(sum,ans);
            }
            sum = 0;
        }
        return ans ;
    }
}
