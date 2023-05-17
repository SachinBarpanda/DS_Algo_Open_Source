package Lec11;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {5, 3, -7, 4, 8, 2};
        sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void sort(int[] arr) {
        for (int i = 1; i <arr.length ; i++) {
            int item = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>item ){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = item;
        }
    }
}
