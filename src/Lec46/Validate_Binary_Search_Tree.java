package Lec46;

public class Validate_Binary_Search_Tree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {
        }
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    class Solution {
        public int max(TreeNode node){
            if(node==null){
                return Integer.MIN_VALUE;
            }
            int a = max(node.right);
            return Math.max(node.val,a);
        }
        public int min (TreeNode node){
            if(node==null){
                return Integer.MAX_VALUE;
            }
            int a = min(node.left);
            return Math.min(a,node.val);
        }

        public boolean isValidBST(TreeNode root) {
            if(root==null){
                return true;
            }
            if(root.left == null && root.right==null){
                return true;
            }
            int a = max(root.left);
            int b = min(root.right);
            if(root.left == null || root.right == null){
                if(root.left==null){
                    if(root.val < b){
                        return isValidBST(root.right);
                    }
                }
                if(root.right==null){
                    if(root.val>a){
                        return isValidBST(root.left);
                    }
                }
            }else {
                if(root.val>a && root.val < b){
                    boolean left = isValidBST(root.left);
                    boolean right = isValidBST(root.right);
                    return left && right;
                }else{
                    return false;
                }

            }
            return false;
        }
    }
}
