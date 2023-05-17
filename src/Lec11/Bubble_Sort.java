package Lec11;

public class Bubble_Sort {
    public static void main(String[] args) {
        int [] arr = {5,3,-7,4,8,2};
        sort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void sort(int [] arr){
        for(int i = 1 ; i < arr.length;i++){
            for(int j = 0 ; j < arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
