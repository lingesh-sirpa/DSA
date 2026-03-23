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

    public static void postTraversal(TreeNode root, List<Integer> ans){
      if(root == null){
        return;
      }
      postTraversal(root.left, ans);
      postTraversal(root.right, ans);
      ans.add(root.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
     List<Integer> ans = new ArrayList<>();
     postTraversal(root, ans);
     return ans;
    }
}
