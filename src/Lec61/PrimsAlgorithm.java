package Lec61;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class PrimsAlgorithm {

        HashMap<Integer, HashMap<Integer, Integer>> map;

	public PrimsAlgorithm(int v) {
            // TODO Auto-generated constructor stub
            this.map = new HashMap<>();
            for (int i = 1; i <= v; i++) {
                map.put(i, new HashMap<>());

            }
        }

        public void addEdge(int v1, int v2, int cost) {

            map.get(v1).put(v2, cost);// v1--> map get kra then put v2 and Cost
            map.get(v2).put(v1, cost);
        }

        public class PrimsPair {
            int vtx;
            int acquireVtx;
            int cost;

            public PrimsPair(int vtx, int acquireVtx, int cost) {
                // TODO Auto-generated constructor stub
                this.vtx = vtx;
                this.cost = cost;
                this.acquireVtx = acquireVtx;

            }

            @Override
            public String toString() {
                return this.vtx + " " + this.acquireVtx + "  @ " + this.cost;
            }
        }

        public void Prims(int src) {

            PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {

                @Override
                public int compare(PrimsPair o1, PrimsPair o2) {
                    // TODO Auto-generated method stub
                    return o1.cost - o2.cost;//
                }
            });
            HashSet<Integer> visited = new HashSet<>();
            pq.add(new PrimsPair(1,1, 0));
            while (!pq.isEmpty()) {
                PrimsPair rp = pq.remove();
                if (visited.contains(rp.acquireVtx)) {
                    continue;
                }
                visited.add(rp.vtx);
                System.out.println(rp);
                for (int nbrs : map.get(rp.vtx).keySet()) {
                    if (!visited.contains(nbrs)) {
                        int cost = rp.cost + map.get(rp.vtx).get(nbrs);
                        PrimsPair dp = new PrimsPair(nbrs, nbrs, cost);
                        pq.add(dp);
                    }
                }
            }

        }

        public static void main(String[] args) {
            PrimsAlgorithm pa = new PrimsAlgorithm(7);
            pa.addEdge(1, 2, 2);
            pa.addEdge(2, 3, 3);
            pa.addEdge(1, 4, 10);
            pa.addEdge(4, 5, 8);
            pa.addEdge(3, 4, 1);
            pa.addEdge(5, 6, 5);
            pa.addEdge(5, 7, 6);
            pa.addEdge(6, 7, 4);
            pa.Prims(1);



    }
}
