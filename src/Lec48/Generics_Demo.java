package Lec48;

import Lec36.P;

import java.awt.*;

public class Generics_Demo {
    public static void main(String[] args) {
        Integer[] arr = {10,20,30,40};
        String[] arr1 = {"Raj", "Riya", "Kunal", "Rajesh"};
        Pair[] p = new Pair[5];
        Display(arr);
        Display(arr1);
        Display(p);
    }
    public static <T> void Display(T[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
class Pair<K,P>{
    K x ;
    P y ;
}
class Generics_Client{
    public static void main(String[] args) {
        Pair<Integer,Integer> p = new Pair<>();
        Pair<Integer,Boolean> p1 = new Pair<>();
        p1.y = true;
        p.y = 10;
        Pair<Long,Integer> p2 = new Pair<>();
    }
}
