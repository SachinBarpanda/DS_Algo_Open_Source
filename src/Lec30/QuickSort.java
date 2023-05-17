package Lec30;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = { 5,3,1,4,2};
        QuickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void QuickSort(int [] arr, int left , int right){
        if(left >= right){
            return;
        }

        int pivot = findPivot(arr,left,right);
        QuickSort(arr, left, pivot - 1);
        QuickSort(arr, pivot, right);

    }

    private static int findPivot(int[] arr, int start, int end) {
        int item = arr[end];
        int pi = start;
        for(int i = start; i < end;i++){
            if(item>arr[i]){
                int temp = arr[i];
                arr[i] = arr[pi];
                arr[pi] = temp;
                pi++;
            }
        }
        int temp = arr[pi];
        arr[pi] = arr[end];
        arr[end] = temp;
        return pi;
    }
}
