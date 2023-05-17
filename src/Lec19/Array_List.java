package Lec19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        System.out.println(a);
        System.out.println(a.size());
        //add
        a.add(10);
        a.add(20);
        a.add(30);
        System.out.println(a);
        a.add(2,-5);
        System.out.println(a);
//        a.remove(2);
        System.out.println(a.remove(2));
        a.set(2,-7);
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
        for(int i : a){
            System.out.print(i+" ");
        }


    }
}
