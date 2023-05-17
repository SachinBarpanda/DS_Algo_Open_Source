package Lec44;

public class Diameter_of_Binary_Tree {
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

    class Solution {
        int maxHeight = 0 ;
        public int diameterOfBinaryTree(TreeNode root) {
            if(root == null ){
                return maxHeight;
            }

            maxHeight = Math.max(height(root.left)+height(root.right)+2, maxHeight);
            diameterOfBinaryTree(root.left);
            diameterOfBinaryTree(root.right);
            return maxHeight;

        }

        private int height(TreeNode node ){
            if(node==null){
                return -1;
            }
            return Math.max(height(node.left), height(node.right))+1;
        }
    }

}
