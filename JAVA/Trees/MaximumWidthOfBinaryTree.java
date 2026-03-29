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

    class Pair{

        TreeNode node;
        int nodeval;

          Pair(TreeNode node, int nodeval){
            this.node = node;
            this.nodeval = nodeval;
          }
    }


    public int widthOfBinaryTree(TreeNode root) {
     
     if(root.left == null && root.right == null){
        return 1;
     }
    
    int maxwidth = 0;

    LinkedList<Pair> q = new LinkedList<>();
    Pair newPair = new Pair(root, 1);
    q.addLast(newPair);

     while(q.size() > 0){

        int size = q.size();

         Pair fn = null;
         Pair ln = null;

         while(size > 0){

            Pair remPair = q.removeFirst();
            TreeNode rem = remPair.node;
            int n = remPair.nodeval;
            
            if(fn == null){
                fn = remPair;
            }
            ln = remPair;

            if(rem.left != null){
            q.addLast(new Pair(rem.left, 2*n));
            }

            if(rem.right != null){
             q.addLast(new Pair(rem.right, (2*n) + 1));
            }

            size--;
         }

        maxwidth = Math.max(maxwidth, ln.nodeval - fn.nodeval + 1);
     }

     return maxwidth;
    }
}
