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
    public List<Integer> rightSideView(TreeNode root) {
        
     List<Integer> ans = new ArrayList<>();
     
     if(root == null){
        return ans;
     }
     LinkedList<TreeNode> q = new LinkedList<>();
     q.addLast(root);

     while(q.size() > 0){
        int size = q.size();
        int ln = 0;
        while(size > 0){
          TreeNode rem = q.removeFirst();
          size--;
          ln = rem.val;
          if(rem.left != null){
            q.addLast(rem.left);
          }
          if(rem.right != null){
            q.addLast(rem.right);
          }
        }
        ans.add(ln);
     }

     return ans;
    }
}
