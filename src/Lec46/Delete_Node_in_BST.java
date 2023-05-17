package Lec46;

public class Delete_Node_in_BST {

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
    public int max(TreeNode node){
        if(node == null){
            return Integer.MIN_VALUE;
        }
        int a = max(node.right);
        return  Math.max(node.val,a);
    }
    public TreeNode deleteNode(TreeNode node , int key){
        if(node==null){
            return null;
        }
        //search
        if(node.val > key){
            node.left = deleteNode(node.left,key);
        }else if(node.val<key){
            node.right = deleteNode(node.right, key);
        }else{
//            if(node.left==null && node.right==null){
//                return null;//not required
//            }
            if(node.left ==null){
                return node.right;
            }else if(node.right == null){
                return node.left;
            }else{
                int max = max(node.left);
                node.val = max;
                node.left = deleteNode(node.left,max);
            }
        }
        return null;
    }
}
