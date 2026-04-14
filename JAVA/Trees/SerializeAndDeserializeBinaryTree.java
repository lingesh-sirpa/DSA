/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null){
            return "";
        }
        
        StringBuilder sb = new StringBuilder();
        LinkedList<TreeNode> q = new LinkedList<>();
        q.addLast(root);
        while(q.size() > 0){
          int size = q.size();
          while(size-- != 0){
            TreeNode rem = q.removeFirst();
            if(rem != null){
                sb.append(rem.val+ " ");
            }else{
                sb.append("#"+ " ");
            }
            if(rem != null){
                q.addLast(rem.left);
                q.addLast(rem.right);
            }
          }
        }

        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length() == 0){
            return null;
        }
        String[] nodes = data.split(" ");
        LinkedList<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        q.addLast(root);
        int idx = 1;
        while(q.size() > 0){
            TreeNode rem = q.removeFirst();
            if(!nodes[idx].equals("#")){
                TreeNode ln = new TreeNode(Integer.parseInt(nodes[idx]));
                rem.left = ln;
                q.addLast(ln);
            }
            idx++;
            if(!nodes[idx].equals("#")){
                TreeNode rn = new TreeNode(Integer.parseInt(nodes[idx]));
                rem.right = rn;
                q.addLast(rn);
            }
            idx++;
        }

        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
