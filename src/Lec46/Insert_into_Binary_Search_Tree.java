package Lec46;

public class Insert_into_Binary_Search_Tree {
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
        public TreeNode insertIntoBST(TreeNode root, int val) {
            if(root==null){
                return new TreeNode(val);
            }
            if(root.val > val){
                 root.left = insertIntoBST(root.left,val);
            }else{
                 root.right = insertIntoBST(root.right,val);
            }
            return root;
        }
    }
}
