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
    public void paths(TreeNode root, String asf, List<String> ans){
        if(root.left == null && root.right == null){
            ans.add(asf);
            return;
        }
        if(root.left != null){
        paths(root.left, asf + "->" + root.left.val, ans);
        }
        if(root.right != null){
        paths(root.right, asf + "->" + root.right.val, ans);
        }

        
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        paths(root, "" + root.val, ans);
        return ans;
    }
}
