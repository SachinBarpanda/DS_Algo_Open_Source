package Lec49;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Demo {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();
        s.add(12);
        s.add(-2);
        s.add(1);
        s.add(9);
        s.add(-11);
        s.add(7);
//        O(1);
        System.out.println(s);

        TreeSet<Integer> s1 = new TreeSet<>();
        s1.add(12);
        s1.add(-2);
        s1.add(1);
        s1.add(9);
        s1.add(-11);
        s1.add(7);
        System.out.println(s1);
//        O(n);
        LinkedHashSet<Integer> s2 = new LinkedHashSet<>();
        s2.add(12);
        s2.add(-2);
        s2.add(1);
        s2.add(9);
        s2.add(-11);
        s2.add(7);
        System.out.println(s2);

//

    }
}
