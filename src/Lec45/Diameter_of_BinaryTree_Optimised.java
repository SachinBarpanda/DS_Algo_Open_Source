package Lec45;

public class Diameter_of_BinaryTree_Optimised {
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
    public class Diapair{
        int height = -1 ;
        int diameter = 0;
    }
    class Solution{
        public Diapair diameterofBinaryTree(TreeNode node){
            if(node == null){
                return new Diapair();
            }
            Diapair leftPair = diameterofBinaryTree(node.left);
            Diapair rightPair = diameterofBinaryTree(node.right);
            Diapair currPair = new Diapair();
            currPair.height = Math.max(leftPair.height,rightPair.height)+1;
            int d = leftPair.height + rightPair.height+2;
            currPair.diameter = Math.max(d,Math.max(leftPair.diameter, rightPair.diameter));
            return currPair;
        }
        public int diameter(TreeNode root1){
            return diameterofBinaryTree(root1).diameter;
        }
        public int diameterOfBinaryTree(TreeNode root) {
            return diameter(root);
        }
    }
}

