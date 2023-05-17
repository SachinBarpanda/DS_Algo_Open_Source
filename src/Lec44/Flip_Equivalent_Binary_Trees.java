package Lec44;

public class Flip_Equivalent_Binary_Trees {
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
    public boolean flipEquiv(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        if (node1.val != node2.val) {
            return false;
        }
        boolean left = flipEquiv(node1.left, node2.right);
        boolean right = flipEquiv(node1.right, node2.left);
        boolean leftE = flipEquiv(node1.left, node2.left);
        boolean rightE = flipEquiv(node1.right, node2.right);
        return (left && right) || (leftE && rightE);
    }

}
