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

    int count;
    public void checkGN(TreeNode root, int maxVal){
        if(root == null){
            return;
        }
        if(maxVal <= root.val){
            count++;
        }
        checkGN(root.left, Math.max(maxVal,root.val));
        checkGN(root.right, Math.max(maxVal, root.val));
    }
    public int goodNodes(TreeNode root) {
        count = 0;
        checkGN(root, Integer.MIN_VALUE);
        return count;
    }
}
