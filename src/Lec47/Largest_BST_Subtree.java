package Lec47;

public class Largest_BST_Subtree {
      public class TreeNode {
          public int val;
          public TreeNode left, right;
          public TreeNode(int val) {
              this.val = val;
              this.left = this.right = null;
          }
      }
    class bstPair{
          int size = 0;
          int max = 0;
          int min = 0;
          boolean isBst = true;
    }
    public class Solution {
        public int largestBst(TreeNode root) {
            return findBst(root).size;
        }
        public bstPair findBst(TreeNode node){
            if(node==null){
                return new bstPair();
            }

            bstPair leftSubtree = findBst(node.left);
            bstPair rightSubtree = findBst(node.right);
            bstPair thisNode = new bstPair();
            thisNode.max = Math.max(node.val,Math.max(leftSubtree.max, rightSubtree.max));
            thisNode.min = Math.min(node.val,Math.min(leftSubtree.min, rightSubtree.min));
            if(leftSubtree.isBst && rightSubtree.isBst && node.val> leftSubtree.max && node.val< rightSubtree.min){
                thisNode.isBst = true;
                thisNode.size = leftSubtree.size+ rightSubtree.size+1;
            }else{
                thisNode.isBst = false;
                thisNode.size =  Math.max(leftSubtree.size, rightSubtree.size);
            }
            return thisNode;
        }
    }
}
