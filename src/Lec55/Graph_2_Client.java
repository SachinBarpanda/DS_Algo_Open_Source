package Lec55;

public class Graph_2_Client {
    public static void main(String[] args) {
        Graph_2 g = new Graph_2(9);
        g.addEdge(1,4,6);
        g.addEdge(1,2,10);
        g.addEdge(2,3,7);
        g.addEdge(3,4,5);
//        g.addEdge(4,5,1);
        g.addEdge(5,6,4);
        g.addEdge(6,7,3);
        g.addEdge(7,5,2);
        g.addEdge(8,9,1);
        g.display();
        System.out.println("*************");
//        System.out.println(g.DFS(1,6));
        g.BFT();
        System.out.println();
        g.DFT();
        System.out.println();
//        System.out.println(g.countComponent());
        System.out.println();
        g.listView2D();
    }

}
