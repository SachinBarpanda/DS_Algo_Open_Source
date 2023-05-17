package Lec10;

public class Rotate_Array_Monu_Bhaiya_Correct {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotateArray(arr,k);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void rotateArray(int[] arr , int k ){
        reversal(arr, arr.length-k,arr.length-1);
        reversal(arr, 0,arr.length-k-1);
        reversal(arr, 0,arr.length-1);
    }

    private static void reversal(int[] arr, int i, int j) {
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
    }


}
