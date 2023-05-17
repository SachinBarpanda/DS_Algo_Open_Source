package Lec14;

public class Transpose_Of_Matrix {
    public static void main(String[] args) {
      int [] [] arr =
                {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        printwave(arr);
        for(int i = 0 ; i < arr.length;i++){
            for(int j = 0 ; j < arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printwave(int[][] arr) {
        for (int i = 0; i <arr.length ; i++) {
            for(int j = i+1 ; j <arr[0].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
