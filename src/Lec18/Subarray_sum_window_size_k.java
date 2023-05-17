package Lec18;

public class Subarray_sum_window_size_k {
    public static void main(String[] args) {
        int [] arr ={10,20,2,3,17,5,18,12,23};
        int k = 3;
        subArraySum(arr,k);
    }

    private static void subArraySum(int[] arr, int k) {
        int sum = 0 ;
        int ans = 0;
        for(int i = 0 ; i < k; i++){
            sum+=arr[i];
            ans = sum;
        }
        for(int i = k; i <arr.length;i++){
            sum+=arr[i];
            sum-=arr[i-k];
            ans = Math.max(sum,ans);
        }
        System.out.println(ans);
    }
}
