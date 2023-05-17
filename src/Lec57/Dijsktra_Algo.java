package Lec57;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Dijsktra_Algo {

    HashMap<Integer,HashMap<Integer,Integer>> map ;

    public Dijsktra_Algo(int v ){
        this.map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i,new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2 , int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }

    public class DijsktraPair{
        int vtx ;
        String shortPath;
        int cost ;

        public DijsktraPair(int vtx , String shortPath, int cost){
            this.vtx = vtx;
            this.shortPath = shortPath;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Vertex => " + vtx + "Path => "+ shortPath + "Cost => "+cost;
        }
    }

    public void bfs(int src){
        HashSet<Integer> set = new HashSet<>();
        PriorityQueue<DijsktraPair> queue = new PriorityQueue<>(new Comparator<DijsktraPair>() {
            @Override
            public int compare(DijsktraPair o1, DijsktraPair o2) {
                return o1.cost-o2.cost;
            }
        });
        queue.add(new DijsktraPair(src,src+" ",0));
        while(!queue.isEmpty()){
            DijsktraPair curr = queue.poll();
            if(set.contains(curr.vtx)){
               continue;
            }
            set.add(curr.vtx);
            System.out.println(curr);
            for(int neighbours : map.get(curr.vtx).keySet()){
                if(!set.contains(neighbours)){
                    queue.add(new DijsktraPair(neighbours,curr.shortPath+neighbours+" ",curr.cost+map.get(curr.vtx).get(neighbours)));
                }
            }

        }
    }

    public static void main(String[] args) {
        Dijsktra_Algo da = new Dijsktra_Algo(7);
        da.addEdge(1,2,2);
        da.addEdge(2,3,3);
        da.addEdge(1,4,10);
        da.addEdge(4,5,8);
        da.addEdge(3,4,1);
        da.addEdge(5,6,5);
        da.addEdge(5,7,6);
        da.addEdge(6,7,4);
        da.bfs(1);

    }

}
