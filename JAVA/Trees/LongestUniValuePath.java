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

    static int pathcount;
    public int longestPath(TreeNode root){
       if(root == null){
        return 0;
       }
       int ls = longestPath(root.left);
       int rs = longestPath(root.right);
      
       int leftPath = 0;
       int rightPath = 0;
      
       if(root.left != null && root.left.val == root.val){
          leftPath = ls + 1;
       }
       if(root.right != null && root.right.val == root.val){
          rightPath = rs + 1;
       }

       pathcount = Math.max(pathcount, leftPath + rightPath);
       return Math.max(leftPath, rightPath);
       
    }
    public int longestUnivaluePath(TreeNode root) {
        pathcount = 0;
        longestPath(root);
        return pathcount;
    }
}
