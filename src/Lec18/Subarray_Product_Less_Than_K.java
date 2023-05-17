package Lec18;

public class Subarray_Product_Less_Than_K {
    public static void main(String[] args) {
        int[] arr = {1,2};
        int k = 0;
        subArrayProduct(arr,k);
    }

    private static int subArrayProduct(int[] arr, int k) {
        int prod = 1;
        int count = 0;
        int start =0 ,end = 0;
        while(end<arr.length) {
            //end index
            prod*=arr[end];
            //start index condition(shrinking)
            while(prod >= k && end>=start) {
                prod/=arr[start];
                start++;
            }
            //answer
            count += end-start+1;
            end++;
        }
        System.out.println(count);
        return count;
    }
}
