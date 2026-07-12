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

    static int sum = 0;

    public void calSum(TreeNode root, int idx){
      if(root == null){
        return;
      }
      if(idx == 0 && root.left == null && root.right == null){
        sum = sum + root.val;
        return;
      }
      if(root.left != null){
        calSum(root.left, 0);
      }
      calSum(root.right, 1);
    }

    public int sumOfLeftLeaves(TreeNode root) {
       if(root.left == null && root.right == null){
        return 0;
       }
       sum = 0;
       calSum(root, -1);
       return sum;
    }
}
