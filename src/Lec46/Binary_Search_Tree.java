package Lec46;

import java.util.Scanner;

public class Binary_Search_Tree {
    public static void main(String[] args) {
        Binary_Search_Tree bst = new Binary_Search_Tree();
        bst.Display();
//        System.out.println(bst.max(bst.root));
    }
    public class Node{
        int val ;
        Node left ;
        Node right ;
    }
    private Node root;
    public Binary_Search_Tree (){
        this.root = CreateBST();
    }
    public int max(Node node){
        if(node == null){
            return Integer.MIN_VALUE;
        }
        int a = max(node.right);
        return  Math.max(node.val,a);
    }
    Scanner sc = new Scanner(System.in);
    private Node CreateBST(){
        int n = sc.nextInt();
        int [] arr =  new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return mergeSort(arr,0,arr.length-1);
    }
    private Node mergeSort(int[] arr , int si , int ei ){
            if(si>ei){
                return null;
            }
            int mid = (ei + si) / 2;
            Node nn = new Node();
            nn.val = arr[mid];
            nn.left = mergeSort(arr, si, mid-1);
            nn.right = mergeSort(arr, mid + 1, ei);
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
}
