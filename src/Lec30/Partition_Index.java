package Lec30;

import java.util.Arrays;

public class Partition_Index {
    public static void main(String[] args) {
        int[] arr= {1,2};
//        int ans = partition(arr,0,arr.length-1);
        partition(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void partition(int[] arr, int si, int ei) {
        int item = arr[ei];
        int pi = si;
        for (int i = si; i < ei; i++) {
            if(item > arr[i]){
                swap(arr,i,pi);
                pi++;
            }
        }
        swap(arr,ei,pi);

    }

    private static void swap(int[] arr , int i, int pi) {
        int temp = arr[i];
        arr[i] = arr[pi];
        arr[pi] = temp;
    }
}
