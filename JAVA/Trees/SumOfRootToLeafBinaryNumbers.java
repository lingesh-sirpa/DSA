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
    int ans = 0;
    public void findSum(TreeNode root, StringBuilder sb){
       if(root.left == null && root.right == null){
         ans += Integer.parseInt(sb.toString(), 2);
         return;
       }
       if(root.left != null){
       findSum(root.left, sb.append(root.left.val));
       sb.deleteCharAt(sb.length() - 1);
       }
       if(root.right != null){
       findSum(root.right, sb.append(root.right.val));
       sb.deleteCharAt(sb.length() - 1);
       }
    }
    public int sumRootToLeaf(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        findSum(root, sb.append(root.val));
        return ans;
    }
}
