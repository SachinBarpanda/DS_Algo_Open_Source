package Lec49;

import java.util.*;

public class HashMap_Demo {
    public static void main(String[] args) {
        //LinkedList use kiya gaya hai
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Raj", 98);
        map.put("Ankit", 77);
        map.put("Amisha", 67);
        map.put(null,88);
        map.put("Puneet", 78);
        map.put("Riya",89);
        map.put("Amisha",90);
        map.put("Deepak" , 48);

//        System.out.println(map);
//
//        //contains
//        //O(1)
//        System.out.println(map.containsKey("Uganda"));
//        System.out.println(map.get("Puneet"));
        //contains
//        //O(1)
//        System.out.println(map.containsKey("Puneet"));
//        System.out.println(map.containsKey("Hello"));
//        //get
//        //O(1)
//        System.out.println(map.get("Amisha"));
//        System.out.println(map.get("Puneeti"));
//        //remove  O(1)
//        System.out.println(map.remove("Riya"));
//        System.out.println(map.remove("Hello"));
//        System.out.println(" Map "+map);




        //Red and Black tree
        TreeMap<String,Integer> map1 = new TreeMap<>();

        map1.put("Raj", 98);
        map1.put("Ankit", 77);
        map1.put("Amisha", 67);
        map1.put("Puneet", 78);
        map1.put("Riya",89);
        map1.put("Amisha",90);
//        map1.put(null,88);// error
//        System.out.println(map1);

        //Insertion order is preserved ,
//        System.out.println("******LinkedHashMap*************");
//        System.out.println("We are getting in ordered Value");
        LinkedHashMap<String,Integer> map2 = new LinkedHashMap<>();
        //O(1)
        map2.put("Raj", 98);
        map2.put("Ankit", 77);
        map2.put("Amisha", 67);
        map2.put("Puneet", 78);
        map2.put("Riya",89);
        map2.put("Amisha",90);
        map2.put(null,88);
//        System.out.println(map2);



        Set<String> s = map.keySet();
        System.out.println(s.size());
        //way1
//        for(String key : s ){
//            System.out.println(key + " " + map.get(key));
//        }

        //way 2
        for(String key:map.keySet()){
            System.out.println(key+" "+map.get(key));
        }

        //way 3
        ArrayList<String> ll = new ArrayList<>(map.keySet());
        for(String key : ll ){
            System.out.println(key + " " + map.get(key));
        }
    }
}
