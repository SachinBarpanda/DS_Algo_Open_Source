package Lec54;

import java.util.concurrent.ConcurrentHashMap;

public class Is_Path_Present {
    public static void main(String[] args) {
        Graph1 g = new Graph1(7);
        g.addEdge(1,4,6);
        g.addEdge(1,2,10);
        g.addEdge(2,3,7);
        g.addEdge(3,4,5);
        g.addEdge(4,5,1);
        g.addEdge(5,6,4);
        g.addEdge(6,7,3);
        g.addEdge(7,5,2);
        System.out.println(pathPresent(g.map,1,1));
    }
    public static boolean pathPresent(ConcurrentHashMap<Integer,ConcurrentHashMap<Integer,Integer>> map, int v1 , int v2){
        if(!map.containsKey(v1)){
            return false;
        }
        if(map.get(v1).containsKey(v2)){
            return true;
        }

        for(int i : map.get(v1).keySet()){
            int x = map.get(v1).get(i);
            int y = map.get(i).get(v1);
            map.get(v1).remove(i);
            map.get(i).remove(v1);
            boolean a = pathPresent(map,i,v2);
            if(a){
                return true;
            }
            map.get(v1).put(i,x);
            map.get(i).put(v1,y);
        }
        return false;
    }
}
