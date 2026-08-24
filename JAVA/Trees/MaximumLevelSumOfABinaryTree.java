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
    public int maxLevelSum(TreeNode root) {

        int ans = 0;
        int maxSum = Integer.MIN_VALUE;
        int level = 1;
        LinkedList<TreeNode> q = new LinkedList<>();
        q.addLast(root);

        while(q.size() > 0){
            int sum = 0;
            int size = q.size();
            while(size > 0){
                TreeNode rem = q.removeFirst();
                sum = sum + rem.val;
                if(rem.left != null){
                    q.addLast(rem.left);
                }
                if(rem.right != null){
                    q.addLast(rem.right);
                }
                size--;
            }
            if(sum > maxSum){
                maxSum = sum;
                ans = level;
            }
            level++;
        }

        return ans;

    }
}
