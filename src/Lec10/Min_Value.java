package Lec10;

public class Min_Value {
    public static void main(String[] args) {
        int []arr= {4,2,5,6,-3,10,45,12};
        System.out.println(find_min(arr));

    }

    private static int find_min(int[] arr) {
        int min = arr[0];
        for(int i = 1 ; i <arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
