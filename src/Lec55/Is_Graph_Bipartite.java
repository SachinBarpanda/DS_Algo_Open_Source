package Lec55;

import java.util.*;

public class Is_Graph_Bipartite {
    public static void main(String[] args) {
        int[][] graph = {{1,2,3},{0,2},{0,1,3},{0,2}};
//        int[][] graph = {{1,3},{0,2},{1,3},{0,2}};
        System.out.println(isBipartite(graph));
    }
    public static boolean isBipartite(int[][] graph) {
        //cycle
        HashMap<Integer,Integer> set = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();
        for(int i = 0 ; i < graph.length ;i++){
            if(!set.containsKey(i)){
                q.add(new Pair(i,0));
                while(!q.isEmpty()){
                    Pair x = q.poll();
                    if(set.containsKey(x.data)){
                        //cycle found code here
                        if(set.get(x.data)==x.level){
                            continue;
                        }else{
                            return false;
                        }
                    }
                    set.put(x.data,x.level);
                    for(int j : graph[x.data]){
                        if(!set.containsKey(j)) {
                            q.add(new Pair(j,x.level+1));
                        }
                    }
                }
            }
        }
        return true;
    }
    static class Pair{
        int data ;
        int level ;

        public Pair(int data, int level) {
            this.data = data;
            this.level = level;
        }
    }
}
