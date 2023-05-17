package Lec10;

public class Second_Min {
    public static void main(String[] args) {
        int []arr= {4,2,5,6,-3,10,45,12,1};
        System.out.println(find_sec_min(arr));

    }

    private static int find_sec_min(int[] arr) {
        int min = arr[0];
        int sec_min = Integer.MAX_VALUE;
        for(int i = 1 ; i <arr.length; i++){
            if(min>arr[i]){
                sec_min = min;
                min = arr[i];
            }else if(sec_min>arr[i]){
                sec_min = arr[i];
            }
        }
        return sec_min;
    }

}