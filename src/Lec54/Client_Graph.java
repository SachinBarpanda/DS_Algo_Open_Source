package Lec54;

import java.util.HashSet;

public class Client_Graph {
    public static void main(String[] args) {
        Graph g = new Graph(7);
        g.addEdge(1,4,6);
        g.addEdge(1,2,10);
        g.addEdge(2,3,7);
        g.addEdge(3,4,5);
        g.addEdge(4,5,1);
        g.addEdge(5,6,4);
        g.addEdge(6,7,3);
        g.addEdge(7,5,2);
        g.display();
        System.out.println("*************");
        HashSet<Integer> set = new HashSet<>();
//        set.add(1);
//        System.out.println(g.hasPath(1,6,set));
//        g.PrintAllPath(1,6,set,"");
        System.out.println(g.BFS(1,6));
    }
}
