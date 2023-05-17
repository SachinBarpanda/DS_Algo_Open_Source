package Lec56;

import java.util.HashMap;

public class Disjoint_Set {
    public class Node{
        int val ;
        Node parent;
        int rank;
    }
    HashMap<Integer,Node> map = new HashMap<>();
    public void Create(int val){
        Node node = new Node();
        node.val = val;
        node.parent = node;
        node.rank = 0;
        map.put(val,node);
    }
    public int find(int val){
        Node node = map.get(val);
        return find(node).val;
    }
    public Node find(Node node){
        if(node.parent == node){
            return node;
        }
        Node nn =  find(node.parent);
        node.parent = nn;
        return nn;
    }

    public void Union(int e1 , int e2){
        Node n1 = map.get(e1);
        Node n2 = map.get(e2);
        Node repEle1 = find(n1);
        Node repEle2 = find(n2);
        if(repEle1.rank == repEle2.rank){
            repEle2.parent = repEle1;
            repEle1.rank++;
        }else if (repEle1.rank > repEle2.rank){
            repEle2.parent = repEle1;
        }else{
            repEle1.parent = repEle2;
        }
    }
}
