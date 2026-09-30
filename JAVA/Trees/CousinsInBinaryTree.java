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

    public boolean isCousins(TreeNode root, int x, int y) {
        
        LinkedList<TreeNode> q = new LinkedList<>();
        HashMap<Integer, int[]> map = new HashMap<>();
        int level = 0;
        int[] a = {level, -1};
        map.put(root.val, a);
        q.addLast(root);
        
        while(q.size() != 0){
            level++;
            int size = q.size();
            while(size-- != 0){
                TreeNode rem = q.removeFirst();
                if(rem.left != null){
                  q.addLast(rem.left);
                  int[] b = {level, rem.val};
                  map.put(rem.left.val, b);
                }
                if(rem.right != null){
                   q.addLast(rem.right);
                   int[] b = {level, rem.val};
                   map.put(rem.right.val, b);
                }
            }
        }

        int[] arr1 = map.get(x);
        int[] arr2 = map.get(y);
        if(arr1[0] != arr2[0] || arr1[1] == arr2[1]){
            return false;
        }

        return true;
    }
}
