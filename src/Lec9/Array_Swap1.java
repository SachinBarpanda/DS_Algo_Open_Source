package Lec9;

import static Lec9.Arrays_Demo.display;

public class Array_Swap1 {
    public static void main(String[] args) {
        int [] arr = {3,2,5,2,5,2,1};
        System.out.println(arr[0] +" "+arr[1]);
        swap(arr[0],arr[1]);
        System.out.println(arr[0] +" "+arr[1]);
    }

    private static void swap(int i, int i1) {
        int temp = i ;
        i = i1;
        i1 = i;
    }
}
