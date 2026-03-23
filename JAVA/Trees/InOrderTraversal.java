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

    public static void inTraversal(TreeNode root, List<Integer> ans){
     if(root == null){
        return;
     }

     inTraversal(root.left, ans);
     ans.add(root.val);
     inTraversal(root.right, ans);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
     List<Integer> ans = new ArrayList<>();
     inTraversal(root, ans);
     return ans;
    }
}
