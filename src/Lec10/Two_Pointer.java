package Lec10;

public class Two_Pointer {
    public static void main(String[] args) {
        int []arr= {4,2,5,6,-3,10,45,12};
        two_pointer_reverse_Array(arr);
        for (int k : arr) {
            System.out.print(k+" ");
        }
    }
    static void two_pointer_reverse_Array(int [] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }

    }
}
