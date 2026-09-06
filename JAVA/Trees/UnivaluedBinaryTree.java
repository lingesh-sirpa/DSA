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
    public boolean checkUT(TreeNode curroot, TreeNode mainroot){
         if(curroot == null){
            return true;
         }
         if(curroot.val != mainroot.val){
            return false;
         }
         boolean lST = checkUT(curroot.left, mainroot);
         if(!lST){
            return false;
         }
         boolean rST = checkUT(curroot.right, mainroot);
         if(!rST){
            return false;
         }

         return (lST && rST);
    }
    public boolean isUnivalTree(TreeNode root) {
        return checkUT(root, root);
    }
}
