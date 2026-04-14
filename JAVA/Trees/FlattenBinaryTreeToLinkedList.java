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

    public TreeNode flattenBT(TreeNode root){
     if(root == null){
        return null;
     }
     if(root.left == null && root.right == null){
        return root;
     }
     TreeNode lt = flattenBT(root.left);
     TreeNode rt = flattenBT(root.right);
     TreeNode lh = root.left;
     TreeNode rh = root.right;
     if(lh == null){
        return rt;
     }else if(rh == null){
        root.right = lh;
        root.left = null;
        return lt;
     }else{
        lt.right = rh;
        root.right = lh;
        root.left = null;
        return rt;
     }
    }
    
    public void flatten(TreeNode root) {
        flattenBT(root);
    }
}
