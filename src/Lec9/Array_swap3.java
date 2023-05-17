package Lec9;

public class Array_swap3 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 2, 5, 2, 1};
        int[] arr2 = {31, 21, 15, 12, 53, 24, 15};
        System.out.println(arr[0] + " " + arr2[0]);
        swap(arr,arr2);
        System.out.println(arr[0] + " " + arr2[0]);
    }

    private static void swap(int[] arr, int[] arr2) {
        int[] temp = arr;
        arr = arr2;
        arr2 = temp;
    }
}
