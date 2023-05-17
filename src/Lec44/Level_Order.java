package Lec44;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Level_Order {
    private class Node{
        int val ;
        Node right ;
        Node left;
    }
    private Node root ;
    Scanner sc = new Scanner(System.in);
    public Level_Order(){
        this.root = CreateTree();
    }
    private Node CreateTree(){
        int n = sc.nextInt();
        Node nn = new Node();
        nn.val = n;
        boolean hasLeft = sc.nextBoolean();
        if(hasLeft){
            nn.left = CreateTree();
        }
        boolean hasRight = sc.nextBoolean();
        if(hasRight){
            nn.right = CreateTree();
        }
        return nn;
    }
    public void LevelOrder(){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node nn = q.remove();
            System.out.print(nn.val+" ");
            if(nn.left!=null){
                q.add(nn.left);
            }
            if(nn.right!=null){
                q.add(nn.right);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Level_Order lo = new Level_Order();
        lo.LevelOrder();
    }
}
