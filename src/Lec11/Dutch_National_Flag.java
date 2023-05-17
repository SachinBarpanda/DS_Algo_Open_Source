package Lec11;

public class Dutch_National_Flag {
    public static void main(String[] args) {
        int [] arr = {2,2,0,0,2,1,0,2,1,2,2};
        sort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    private static void sort(int[] arr) {
        int i = 0 ,k = 0 ,j=arr.length-1;
        while(k<j){
            for(int l : arr){
                System.out.print(l+" ");
            }
            System.out.println();
            if(arr[k] == 2){
                swap(arr,k,j);
                j--;
            }else if(arr[k] == 0){
                swap(arr,k,i);
                i++;
                k++;
            }else{
                k++;
            }
        }
    }
    private static void swap(int [] arr , int k , int j){
        int temp = arr[k];
        arr[k] = arr[j];
        arr[j] = temp;
    }

}
