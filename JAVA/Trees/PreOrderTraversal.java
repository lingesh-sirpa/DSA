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

    public static void preTraversal(TreeNode root, List<Integer> ans){
      if(root == null){
        return;
      }
      ans.add(root.val);
      preTraversal(root.left, ans);
      preTraversal(root.right, ans);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
     List<Integer> ans = new ArrayList<>();
     preTraversal(root, ans);
     return ans;
    }
}
