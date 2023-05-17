package Lec57;

import java.util.ArrayList;
import java.util.HashMap;

public class BellManFord_Algorithm {
    public static void main(String[] args) {
        BellManFord_Algorithm bfd = new BellManFord_Algorithm(5);
        bfd.addEdge(1, 2, 8);
        bfd.addEdge(2, 5, -2);
//        bfd.addEdge(2, 5, 2);
        bfd.addEdge(5, 2, 1);
        bfd.addEdge(4, 5, 4);
        bfd.addEdge(3, 4, -3);
        bfd.addEdge(1, 3, 4);
        bfd.addEdge(1, 4, 5);
        bfd.BellmanFord();
    }
    HashMap<Integer,HashMap<Integer,Integer>> map;
    public BellManFord_Algorithm(int v){
        this.map = new HashMap<>();
        for (int i = 0; i < v; i++) {
            map.put(v,new HashMap<>());
        }
    }
    public void addEdge(int v1 , int v2 , int cost){
        map.get(v1).put(v2,cost);
    }

    class EdgePair{
        int e1 ;
        int e2 ;
        int cost ;

        public EdgePair(int e1 , int e2 , int cost ){
            this.cost = cost ;
            this.e1 = e1;
            this.e2 = e2;
        }
    }
    public ArrayList<EdgePair> getAllEdge(){
        ArrayList<EdgePair> list = new ArrayList<>();
        for(int e1 : map.keySet()){
            for(int e2 : map.get(e1).keySet()){
                EdgePair ep = new EdgePair(e1, e2 , map.get(e1).get(e2));
                list.add(ep);
            }
        }
        return list;
    }
    public void BellmanFord(){
        ArrayList<EdgePair> list = getAllEdge();
        int v = map.size();
        int [] dis = new int[v+1];
        for (int i = 2; i < dis.length; i++) {
            dis[i] = 787978;
        }
        for (int i = 1; i <= v; i++) {
            for(EdgePair e : list ){
                if(i==v && dis[e.e2] > dis[e.e1]+e.cost){
                    System.out.println("-ve wwight cycle");
                    return;
                }
                if(dis[e.e2] > dis[e.e1]+e.cost){
                    dis[e.e2] = dis[e.e1]+e.cost;
                }
            }
        }
        for(int i = 1; i < dis.length;i++){
            System.out.println(dis[i]+ " ");
        }
    }

}
