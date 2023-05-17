package Lec54;

import java.util.*;

public class Graph {
    HashMap<Integer,HashMap<Integer,Integer>> map;
    public Graph(int v){
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i,new HashMap<>());
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

    public boolean hasPath(int v1 , int v2 , HashSet<Integer> set){
        if(v1 == v2){
            return true;
        }
        for(int key : map.get(v1).keySet()){
            if(!set.contains(key)) {
                set.add(key);
                boolean ans = hasPath(key, v2,set);
                if (ans) {
                    return true;
                }
                set.remove(key);
            }
        }
        return false;
    }
    public void PrintAllPath(int v1 , int v2 , HashSet<Integer> set, String ans){
        if(v1 == v2){
            System.out.println(ans+"6");
            return ;
        }
        set.add(v1);
        ans+=v1+" ";
        for(int key : map.get(v1).keySet()){
            if(!set.contains(key)) {
                PrintAllPath(key, v2,set , ans);
            }
        }
        ans.substring(0,ans.length()-1);
        set.remove(v1);
    }
    public boolean BFS(int src , int des){
        Queue<Integer> q = new LinkedList();
        HashSet<Integer> set = new HashSet<>();
        q.add(src);
        while(!q.isEmpty()){
            int a = q.poll();
            if(set.contains(a)){
                continue;
            }
            set.add(a);
            if(a==des){
                return true;
            }
            for(int x : map.get(a).keySet()){
                if(!set.contains(x)) {
                    q.add(x);
                }
            }
        }
        return false;
    }


}


















