package Lec47;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_Right_Side_View {
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
        List<Integer> list = new ArrayList<>();
        public int getLast(Queue<TreeNode> queue){
            Queue<TreeNode> tempQ = new LinkedList<>();
            while(queue.size() > 1){
                tempQ.add(queue.remove());
            }
            int a =  queue.peek().val;
            tempQ.add(queue.remove());
            while(!tempQ.isEmpty()){
                queue.add(tempQ.remove());
            }
            return a;

        }
        public List<Integer> rightSideView(TreeNode root) {
            Queue<TreeNode> q = new LinkedList<>();
            if(root!=null){
                q.add(root);
                list.add(root.val);
            }

            while(!q.isEmpty()) {
                TreeNode node = q.poll();
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }

                if(!q.isEmpty() && list.get(list.size()-1) == node.val){
                    list.add(getLast(q));
                }

            }
            return list;
        }
    }
}
