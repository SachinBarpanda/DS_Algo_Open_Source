package Lec30;

import java.util.Arrays;

public class Merge_Two_Sorted_Array {
    public static void main(String[] args) {
        int [] arr1 = {3,5,7,9,11};
        int [] arr2 = {1,2,3,4,6,7};
        System.out.println(Arrays.toString(Merge2Array(arr1,arr2)));
    }
    public static int[] Merge2Array(int[] arr1 , int[] arr2){
        int i = 0;
        int j = 0;
        int k = 0;
        int [] ans = new int[arr1.length+arr2.length];
        while(i<arr1.length && j < arr2.length){
            if(arr1[i]>arr2[j]){
                ans[k] = arr2[j];
                j++;k++;
            }else{
                ans[k] = arr1[i];
                i++;k++;
            }
        }
        while(i<arr1.length){
            ans[k] = arr1[i];
            k++;i++;
        }
        while(j<arr2.length){
            ans[k] = arr2[j];
            k++;j++;
        }
        return ans;
    }
}
