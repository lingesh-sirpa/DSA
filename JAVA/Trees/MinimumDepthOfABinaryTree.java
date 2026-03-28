/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {



    public int findMinDepth(TreeNode root){
       
       if(root.left == null && root.right == null){
        return 1;
       }
      
       if(root.left != null && root.right == null){
         int lh = findMinDepth(root.left);
         int depth = lh + 1;
         return depth;
       }
       if(root.left == null && root.right != null){
        int rh = findMinDepth(root.right);
        int depth = rh + 1;
        return depth;
       }
       if(root.left != null && root.right != null){
        int lh = findMinDepth(root.left);
        int rh = findMinDepth(root.right);
        int depth = Math.min(lh, rh) + 1;
        return depth;
       }

       return 0;
    }

    public int minDepth(TreeNode root) {
       if(root == null){
        return 0;
       }
       if(root.left == null && root.right == null){
        return 1;
       }
       return findMinDepth(root);

    }
}
