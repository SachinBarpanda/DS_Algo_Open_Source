package Lec47;

public class CreateTree_Pre_and_To {
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
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            return building(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
        }
        public TreeNode building(int[] po , int plow , int phigh, int[] io, int ilow , int ihigh){
            if(ilow>ihigh){
                return null;
            }
            TreeNode nn = new TreeNode();
            nn.val=po[plow];
            int idx = search(io , po[plow]);
            nn.left = building(po,plow+1,plow+(idx-ilow),io,ilow,idx-1);
            nn.right = building(po,plow+(idx-ilow)+1,phigh,io,idx+1,ihigh);
            return nn;

        }
        private int search(int[] arr , int x){
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == x){
                    return i;
                }
            }
            return -1;
        }
    }
}
