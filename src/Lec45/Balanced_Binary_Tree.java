package Lec45;

public class Balanced_Binary_Tree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public class hNode{
        int height = -1;
        int diff = 0;
    }
    public boolean isBalanced(TreeNode root) {
        if(Math.abs(checkBalance(root).diff)<=1){
            return true;
        }else{
            return false;
        }
    }
    public hNode checkBalance(TreeNode node){
        if(node == null){
            return new hNode();
        }
        hNode left = checkBalance(node.left);
        hNode right = checkBalance(node.right);
        hNode curr = new hNode();
        curr.height = Math.max(left.height, right.height)+1;
        curr.diff = Math.max(left.height-right.height,Math.max(left.diff,right.diff));
        return curr;
    }
}
