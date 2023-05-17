package Lec49;

import java.util.ArrayList;
import java.util.HashMap;

public class InsertionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int [] arr2 = {2,2};
        Intersection(arr1,arr2);
    }
    public static void Intersection(int[] arr1 , int[] arr2){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if(map.containsKey(arr1[i])){
                map.put(arr1[i], map.get(arr1[i])+1);
            }else{
                map.put(arr1[i],1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            if(map.containsKey(arr2[i]) && map.get(arr2[i])>0){
                list.add(arr2[i]);
                map.put(arr2[i], map.get(arr2[i])-1);
            }
        }
        System.out.println(list);
    }
}
