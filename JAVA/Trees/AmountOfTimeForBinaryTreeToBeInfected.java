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

    HashMap<Integer, TreeNode> map = new HashMap<>();
    TreeNode startNode = null;

    public void dfs(TreeNode root, int value, TreeNode par){
       if(root == null){
        return;
       }
       if(root.val == value){
        startNode = root;
       }
       map.put(root.val, par);
       dfs(root.left, value, root);
       dfs(root.right, value, root);
    }

    public int amountOfTime(TreeNode root, int start) {
        dfs(root, start, null);
        LinkedList<TreeNode> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        q.addLast(startNode);
        int time = 0;
        
        while(q.size() > 0){
            int size = q.size();
            while(size-- != 0){
              TreeNode rem = q.removeFirst();
              visited.add(rem.val);
              TreeNode par = map.get(rem.val);
              if(par != null && !visited.contains(par.val)){
                 q.addLast(par);
              }
              if(rem.left != null && !visited.contains(rem.left.val)){
                q.addLast(rem.left);
              }
              if(rem.right != null && !visited.contains(rem.right.val)){
                q.addLast(rem.right);
              }
            }
            time++;
        }

        return --time;
    }
}
