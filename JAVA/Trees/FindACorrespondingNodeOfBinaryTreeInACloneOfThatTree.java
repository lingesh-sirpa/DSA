/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

        LinkedList<TreeNode> q = new LinkedList<>();
        q.addLast(cloned);
        while(q.size() > 0){
            TreeNode rem = q.removeFirst();
            if(rem.val == target.val){
                return rem;
            }
            if(rem.left != null){
                q.addLast(rem.left);
            }
            if(rem.right != null){
                q.addLast(rem.right);
            }
        }


        return null;
    }
}
