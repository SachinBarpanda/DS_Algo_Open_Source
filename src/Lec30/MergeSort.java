package Lec30;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr= {5,3,1,4,2};
        int [] ans = MergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] MergeSort(int[] arr, int low , int high){
        if(low==high) {
            int[] bs = new int[1];
            bs[0] = arr[low];
            return bs;
        }

        int mid = (low + high) / 2;
        int[] a = MergeSort(arr, low, mid);
        int[] b = MergeSort(arr, mid + 1, high);
        return merge(a,b);


    }
    public static int[] merge(int[] a, int[] b ){
        int i= 0;
        int j= 0;
        int k = 0;
        int [] ans = new int[a.length+b.length];
        while(i < a.length && j < b.length){
            if(a[i]>b[j]){
                ans[k] = b[j];
                k++;j++;
            }else{
                ans[k] = a[i];
                i++;k++;
            }
        }
        while(i<a.length){
            ans[k] = a[i];
            k++;i++;
        }
        while(j<b.length){
            ans[k] = b[j];
            k++;j++;
        }
        return ans;
    }
}
