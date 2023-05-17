package Lec51;

import Lec36.C;

import java.util.Arrays;
import java.util.Comparator;

public class Car_Client {
    public static void main(String[] args) {
        Cars[] arr = new Cars[5];
        arr[0] = new Cars(200,10,"White");
        arr[1] = new Cars(1000,20,"Grey");
        arr[2] = new Cars(345,3,"Red");
        arr[3] = new Cars(34,89,"Black");
        arr[4] = new Cars(8907,6,"Yellow");
//        Sort(arr);
        Arrays.sort(arr, new Comparator<Cars>() {
            @Override
            public int compare(Cars o1, Cars o2) {
                return o1.price - o2.price;
            }
        });
        Display(arr);
//        System.out.println("Speed ke basis pe");
//        Sort(arr,new CarSpeedComparator());
//        Display(arr);
//        System.out.println("\nPrice ke basis pe");
//        Sort(arr,new CarPriceComparator());
//        Display(arr);
//        System.out.println("\nColor ke basis pe");
//        Sort(arr,new CarColorComparator());
//        Display(arr);

    }
    private static void Display(Cars[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
//    public static <T extends Comparable<T>>void Sort(T[] arr){
//        for(int i = 0 ; i < arr.length ; i++){
//            for(int j = 0; j < arr.length-i-1;j++){
//                if( arr[j].compareTo(arr[j+1])>0){
//                    T temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//    }
    public static <T>void Sort(T[] arr, Comparator<T> comp){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0; j < arr.length-i-1;j++){
                if( comp.compare(arr[j],arr[j+1])>0){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
