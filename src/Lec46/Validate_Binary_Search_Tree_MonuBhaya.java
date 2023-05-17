package Lec46;

public class Validate_Binary_Search_Tree_MonuBhaya {
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
    class BstPair{
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        boolean isbst = true;
    }
    class Solution {
        public boolean isValidBST(TreeNode root) {
            return validBst(root).isbst;
        }
        public BstPair validBst(TreeNode node){
            if (node == null) {
                return new BstPair();
            }
            BstPair left = validBst(node.left);
            BstPair right = validBst(node.right);
            BstPair curr = new BstPair();
            if(left.isbst && right.isbst && left.max<node.val && right.min > node.val){
                curr.isbst = true;
            }else{
                curr.isbst = false;
            }
            curr.max = Math.max(node.val,Math.max(left.max,right.max));
            curr.min = Math.min(node.val,Math.min(left.min,right.min));
            return curr;
        }
    }
}
