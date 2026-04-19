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
    TreeNode fn = null;
    TreeNode sn = null;
    TreeNode prev = null;

    public void recoverBST(TreeNode root){
       if(root == null){
        return;
       }
       recoverBST(root.left);
       if(prev != null){
         if(!(prev.val < root.val)){
           if(fn == null){
            fn = prev;
           }
           sn = root;
          } 
        }
       prev = root;
       recoverBST(root.right);
    }
    
    public void recoverTree(TreeNode root) {
        recoverBST(root);
        int temp = fn.val;
        fn.val = sn.val;
        sn.val = temp;
    }
}
