package Lec9;

public class Array_Swap2 {

    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 2, 5, 2, 1};
        System.out.println(arr[0] + " " + arr[1]);
        swap(arr,0, 1);
        System.out.println(arr[0] + " " + arr[1]);
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
