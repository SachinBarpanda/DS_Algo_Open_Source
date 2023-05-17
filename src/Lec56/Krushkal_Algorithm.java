package Lec56;
import java.util.*;

public class Krushkal_Algorithm {
    HashMap<Integer, HashMap<Integer,Integer>> map;

    public Krushkal_Algorithm(int v){
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i,new HashMap<>());
        }
    }
    public void addEdge(int v1 , int v2 , int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public class EdgePair {
        int v1 ;
        int v2 ;
        int cost ;

        public EdgePair(int v1, int v2, int cost) {
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }
    }
    public List<EdgePair> AllEdgeList(){
        List<EdgePair> ll = new ArrayList<>();
        for(int key : map.keySet()){
            for(int nbrs : map.get(key).keySet()){
                ll.add(new EdgePair(nbrs,key,map.get(key).get(nbrs)));
            }
        }
        return ll;
    }

    public  int Krushkal(){
        List<EdgePair> ll = AllEdgeList();
        Collections.sort(ll, new Comparator<EdgePair>() {
            @Override
            public int compare(EdgePair o1, EdgePair o2) {
                return o1.cost - o2.cost;
            }
        });
        Disjoint_Set dsu = new Disjoint_Set();
        for (int i : map.keySet()) {
            dsu.Create(i);
        }
        int ans = 0;
        for(EdgePair e : ll){
            int e1 = e.v1;
            int e2 = e.v2;
            int r1 = dsu.find(e1);
            int r2 = dsu.find(e2);
            if(r1==r2){

            }else{
//                System.out.println(e);
                ans += e.cost;
                dsu.Union(r1,r2);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Krushkal_Algorithm ka = new Krushkal_Algorithm(n);
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int cost = sc.nextInt();
            ka.addEdge(v1,v2,cost);
        }
        System.out.println(ka.Krushkal());
    }
}
