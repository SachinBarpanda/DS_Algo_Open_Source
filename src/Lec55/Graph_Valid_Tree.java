package Lec55;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Graph_Valid_Tree {
    public static void main(String[] args) {

    }


    public static Boolean checkGraph(int[][] edges, int n, int m) {
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i,new HashSet<>());
        }
        for (int i = 0; i < edges.length; i++) {
            map.get(edges[i][0]).add(edges[i][1]);
            map.get(edges[i][1]).add(edges[i][0]);
        }
        return isValidTree(map);
    }
    public static boolean isValidTree(HashMap<Integer,HashSet<Integer>> map){
        HashSet<Integer> set = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        for(int key : map.keySet()){
            if(!set.contains(key)){
                count++;
                q.add(key);
                while(!q.isEmpty()){
                    int i = q.poll();
                    if(set.contains(i)){
                        return false;
                    }
                    set.add(i);
                    for(int x : map.get(i)){
                        if(!set.contains(x)) {
                            q.add(x);
                        }
                    }
                }
            }
        }
        return count==1;
    }
}
