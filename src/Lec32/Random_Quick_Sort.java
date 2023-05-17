package Lec32;

import java.util.Arrays;

public class Random_Quick_Sort {
    public static void main(String[] args) {
        int[] arr = {2,5,1,7,3,8,9,1,4};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr , int left , int right){
        if(left>=right){
            return;
        }
        int pivot = pivotFind(arr,left,right);
        quickSort(arr,left,pivot-1);
        quickSort(arr,pivot+1,right);
    }
    public static int pivotFind(int[] arr, int left , int right ){
        int rando = (int)(Math.random()*(right-left+1)+left);
        int pivot = right;

        int temp1 = arr[rando];
        arr[rando] = arr[pivot];
        arr[pivot]= temp1;

        int i = left; int j = left ;
        while(j<right){
            if(arr[j]>arr[pivot]){
                j++;
            }else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;j++;
            }
        }
        int temp = arr[pivot];
        arr[pivot] = arr[i];
        arr[i] = temp;

        return i;
    }
}
