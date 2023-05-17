package Lec43;

import java.util.Scanner;

public class BinaryTree {
    private class Node{
        int val ;
        Node right ;
        Node left;
    }
    private Node root ;
    Scanner sc = new Scanner(System.in);
    public BinaryTree(){
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
    public void postOrder(){
        postOrder(root);
    }
    public void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val+" ");
    }
    public void inOrder(){
        inOrder(root);
    }
    public void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.val+" ");
        inOrder(node.right);
    }
    public void preOrder(){
        preOrder(root);
    }
    public void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.val+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public boolean find(int item){
        return find(root,item);
    }
    public boolean find(Node node , int item){
        if(node == null){
            return false;
        }
        if(node.val == item){
            return true;
        }
        boolean lf = find(node.left,item);
        boolean rf = find(node.right,item);
        return lf||rf;
    }
    public int max(){
        return max(this.root);
    }
    public int max(Node node){
        if(node==null){
            return Integer.MIN_VALUE;
        }
        int lMax = max(node.left);
        int rMax = max(node.right);
        return Math.max(node.val,Math.max(lMax, rMax));
    }
    public int heightTree(){
        return heightTree(this.root);
    }
    private int heightTree(Node node){
        if(node==null){
            return -1;
        }
        int leftHeight = heightTree(node.left);
        int rightHeight = heightTree(node.right);
        return Math.max(leftHeight, rightHeight)+1;
    }
}
class Tree_Client{
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.Display();
        bt.preOrder();
        System.out.println(bt.find(40));
        System.out.println(bt.max());
        System.out.println(bt.heightTree());
    }
}
//10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false