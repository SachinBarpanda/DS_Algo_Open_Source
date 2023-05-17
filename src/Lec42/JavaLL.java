package Lec42;

import java.util.LinkedList;

public class JavaLL {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);ll.add(40);
        System.out.println(ll);
        System.out.println(ll.remove());
        ll.add(2,-9);
        System.out.println(ll);
        System.out.println(ll.get(3));
    }
}
