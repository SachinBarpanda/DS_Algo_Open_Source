package Lec50;

public class HashMapClient {
    public static void main(String[] args) {
        MyHashMap<String,Integer> map = new MyHashMap<>();
        map.put("Aditi",20);
        map.put("Kunal" , 10);
        map.put("Ankita", 6);
        map.put("Kamlesh",16);
        map.put("Raj",60);
        map.put("Nitish",30);
        map.put("Aditi",20);
        map.put("Kunal" , 10);
        map.put("Ankita", 6);
        map.put("Kamlesh",16);
        map.put("Raj",60);
        map.put("Nitish",30);
        map.put("Aditi",20);
        map.put("Kunal" , 10);
        map.put("Ankita", 6);
        map.put("Kamlesh",16);
        map.put("Raj",60);
        map.put("Nitish",30);
        System.out.println(map.containsKey("Aditi"));
        System.out.println(map.get("Aditi"));
        System.out.println(map);
        System.out.println(map.remove("Kamlesh"));
        System.out.println(map);
    }
}
