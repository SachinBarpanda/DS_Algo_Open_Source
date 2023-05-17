package Lec54;

import java.util.concurrent.ConcurrentHashMap;

public class Graph1 {
    ConcurrentHashMap<Integer,ConcurrentHashMap<Integer,Integer>> map;
    public Graph1(int v){
        map = new ConcurrentHashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i,new ConcurrentHashMap<>());
        }
    }
    public void addEdge(int v1 , int v2 , int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }

    public boolean ContainEdge(int v1 , int v2){
        return map.get(v1).containsKey(v2) ;
    }
    public boolean ContainsVertex(int v1){
        return map.containsKey(v1);
    }
    public int totalEdges(){
        int count = 0;
        for(Integer i : map.keySet()){
            count += map.get(i).size();
        }
        return count/2;
    }

    public void removeEdge(int v1 , int v2){
        if(ContainEdge(v1,v2)) {
            map.get(v1).remove(v2);
            map.get(v2).remove(v1);
        }
    }

    public void removeVertex(int v1){
        for(int i : map.get(v1).keySet()){
            map.get(i).remove(v1);
        }
        map.remove(v1);
    }

    public void display(){
        for(int i : map.keySet()){
            System.out.println(i + "->"+ map.get(i));
        }
    }


}
