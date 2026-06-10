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

    public boolean pathSum(TreeNode root, int tar){

       LinkedList<TreeNode[]> q = new LinkedList<>();
       if(root != null){
        TreeNode[] arr = {root, new TreeNode(root.val)};
        q.addLast(arr);
       }

       while(q.size() > 0){
         int size = q.size();
         while(size > 0){
            TreeNode[] rem = q.removeFirst();
            TreeNode node = rem[0];
            TreeNode sum = rem[1];
            if(node.left == null && node.right == null && sum.val == tar){
                return true;
            }
            if(node.left != null){
                TreeNode[] arr = {node.left, new TreeNode(sum.val + node.left.val)};
                q.addLast(arr);
            }
            if(node.right != null){
                TreeNode[] arr = {node.right, new TreeNode(sum.val + node.right.val)};
                q.addLast(arr);
            }
            size--;
         }
       }
        
       return false;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return pathSum(root, targetSum);
    }
}
