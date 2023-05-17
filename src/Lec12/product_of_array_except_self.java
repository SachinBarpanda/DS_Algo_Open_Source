package Lec12;

import java.util.Arrays;

public class product_of_array_except_self {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        productOfArray(arr);
        System.out.println(Arrays.toString(arr));

    }
    private static int[] productOfArray(int [] arr){
        int []left = new int[arr.length];
        int []right = new int[arr.length];
        left[0] = 1;
        for(int i = 1 ; i < arr.length;i++){
            left[i] = left[i-1] * arr[i-1];
        }
        right[arr.length-1] = 1;
        for(int i = arr.length-2;i>=0;i--){
            right[i]=right[i+1]*arr[i+1];
        }
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = left[i] * right[i];
        }
        return arr;
    }
}
