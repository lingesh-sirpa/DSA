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
     
    int maxdepth = 0;

    public int checkmaxdepth(TreeNode root){
       if(root == null){
        return 0;
       }
       int lh = checkmaxdepth(root.left);
       int rh = checkmaxdepth(root.right);
       int depth = Math.max(lh, rh) + 1;
       if(depth > maxdepth){
        maxdepth = depth;
       }
       return Math.max(lh, rh) + 1;
    }

    public int maxDepth(TreeNode root) {
        maxdepth = 0;
        checkmaxdepth(root);
        return maxdepth;
    }
}
