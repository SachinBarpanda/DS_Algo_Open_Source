package Lec44;

import java.util.ArrayList;
import java.util.List;

public class Sum_Root_to_Leaf_Numbers {
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
    public int sumNumbers(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        treeSum(root,list,0);
        int sum = 0 ;
        for(int i : list){
            sum+=i;
        }
        return sum;
    }
    public void treeSum(TreeNode node , List<Integer> list, int curr){
        if(node==null){
            return;
        }

        if(node.left==null && node.right==null){
            list.add(curr);
        }

        curr=curr*10+node.val;
        treeSum(node.left,list,curr);
        treeSum(node.right,list,curr);
    }
}
