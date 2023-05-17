package Lec18;

public class Subarray_Product_Less_Than_K_Monu_Bhaiya {
    public static void main(String[] args) {
        int[] arr = {10,5,2,6};
        int k = 0;
        subArrayProductMonuBhaiya(arr,k);
    }

    private static int subArrayProductMonuBhaiya(int[] arr, int k) {
        int prod = 1;
        int count = 0;
        int start =0 ,end = 0;
        while(end<arr.length) {
            //grow window
            prod *=arr[end];
            //shrink window
            while(prod>=k && end>=start){
                prod /=arr[start];
                start++;
            }
            count+=end-start+1;
            end++;
        }
        return count;
    }
}
