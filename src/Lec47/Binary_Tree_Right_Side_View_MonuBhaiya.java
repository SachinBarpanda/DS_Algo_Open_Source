package Lec47;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Right_Side_View_MonuBhaiya {
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
        int maxDepth = -1;
        List<Integer> list = new ArrayList<>();
        public List<Integer> rightSideView(TreeNode root) {
             goInsideTree(root,0);
             return list;
        }
        public void goInsideTree(TreeNode node , int level){
            if(node == null){
                return ;
            }
            if(level>maxDepth){
                maxDepth = level;
                list.add(node.val);
            }
            goInsideTree(node.right,level+1);
            goInsideTree(node.left,level+1);

        }
    }
}
