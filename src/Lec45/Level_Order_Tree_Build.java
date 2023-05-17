package Lec45;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Level_Order_Tree_Build {
    public class Node {
        int val ;
        Node left ;
        Node right ;
    }
    private Node root ;

    public Level_Order_Tree_Build(){
        this.root = CreateTree();
    }
    private Node CreateTree(){
        Scanner sc = new Scanner(System.in);
        Queue<Node> q = new LinkedList<>();
        Node nn = new Node();
        nn.val = sc.nextInt();
        root = nn;
        q.add(nn);
        while(!q.isEmpty()) {
            Node temp = q.poll();
            int a = 0;
            int b = 0;
            if ((a = sc.nextInt()) != -1) {
                Node leftNode = new Node();
                leftNode.val = a;
                temp.left= leftNode;
                q.add(temp.left);
            }
            if ((b = sc.nextInt()) != -1) {
                Node rightNode = new Node();
                rightNode.val = b;
                temp.right = rightNode;
                q.add(temp.right);
            }
        }
        return root;
    }
    public void Display(){
        Display(root);
    }
    public void Display(Node nn){
        if(nn == null){
            return;
        }
        String s = "<--" + nn.val +"-->";
        if(nn.left!=null){
            s = nn.left.val + s;
        }else{
            s = "."+s;
        }
        if (nn.right != null) {
            s = s+nn.right.val;
        }else{
            s=s+".";
        }
        System.out.println(s);
        Display(nn.left);
        Display(nn.right);
    }

    public static void main(String[] args) {
        Level_Order_Tree_Build lt = new Level_Order_Tree_Build();
        lt.Display();
    }
}
