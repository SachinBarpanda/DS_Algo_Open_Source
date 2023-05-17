package Lec11;

public class Selection_Sort {
    public static void main(String[] args) {
        int [] arr = {5,3,-7,4,8,2};
        sort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    private static void sort(int[] arr) {
        for(int i = 0 ; i < arr.length;i++){
            int minI = i;
            for(int j = i ; j < arr.length;j++){
                if(arr[j]<arr[minI]){
                    minI = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minI];
            arr[minI] = temp;
        }
    }
}
