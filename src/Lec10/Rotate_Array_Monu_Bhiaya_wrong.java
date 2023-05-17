package Lec10;

public class Rotate_Array_Monu_Bhiaya_wrong {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotateArray(arr,k);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    private static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k%n;
        while(k>0){
            int temp = arr[n-1];
            for(int i = n-2; i >=0;i--){
                arr[i+1] = arr[i];
            }
            arr[0] = temp;
            k--;
        }

    }
}
