package Lec9;

public class Arrays_Demo {
    public static void main(String[] args) {
        int [] arr = new int[5];
        int arr1 [] = new int[5];//c type array
        System.out.println(arr);

        arr[0] = 7;
        arr[1] = -17;
        arr[2] = 11;
        arr[3] = 10;
        arr[4] = 56;

        display(arr);
    }
    public static void display(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
