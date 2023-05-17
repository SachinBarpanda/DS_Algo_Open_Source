package Lec10;

public class Two_Pointer_fixed_reverse {
    public static void main(String[] args) {
        int []arr= {4,2,5,6,-3,10,45,12};
        int i = 1;
        int j = 4;
        two_pointer_reverse_Array(arr,i,j);
        for (int k : arr) {
            System.out.print(k+" ");
        }
    }
    static void two_pointer_reverse_Array(int [] arr,int i , int j){

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }

    }
}