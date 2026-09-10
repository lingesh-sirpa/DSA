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
    public int[] countAS(TreeNode root){
        if(root == null){
            int[] arr = {0, 0};
            return arr;
        }
        int[] lST = countAS(root.left);
        int[] rST = countAS(root.right);
        int avg = (lST[0] + rST[0] + root.val) / (lST[1] + rST[1] + 1);
        if(avg == root.val){
            count++;
        }
        int[] arr = {(lST[0] + rST[0] + root.val), (lST[1] + rST[1] + 1)};
        return arr;

    }
    public int averageOfSubtree(TreeNode root) {
        count = 0;
        countAS(root);
        return count;
    }
}
