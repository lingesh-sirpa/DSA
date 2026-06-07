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

    static HashMap<Integer, int[]> map = new HashMap<>();

    public TreeNode searchNode(int parent_val, int side){
         if(map.containsKey(parent_val)){
            int[] arr = map.get(parent_val);
            if(arr[side] == -1){
                return null;
            }else{
                return new TreeNode(arr[side]);
            }
         }

        return null;
    }

    public void createBT(int[][] descriptions, TreeNode head){
        if(head == null){
            return;
        }
        head.left = searchNode(head.val, 0);
        createBT(descriptions, head.left);
        head.right = searchNode(head.val, 1);
        createBT(descriptions, head.right);
    }

    public TreeNode createBinaryTree(int[][] descriptions) {
        map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        int parentNodeVal = -1;

        for(int i = 0; i < descriptions.length; i++){
            int parent_Node = descriptions[i][0];
            int child_Node = descriptions[i][1];
            int lOrR_Node = descriptions[i][2];

            if(map.containsKey(parent_Node)){
                 int[] arr = map.get(parent_Node);
                 if(lOrR_Node == 1){
                    arr[0] = child_Node;
                    map.put(parent_Node, arr);
                 }else if(lOrR_Node == 0){
                    arr[1] = child_Node;
                    map.put(parent_Node, arr);
                 }
            }else{
                int[] arr = {-1, -1};
                if(lOrR_Node == 1){
                   arr[0] = child_Node;
                   map.put(parent_Node, arr);
                }else if(lOrR_Node == 0){
                    arr[1] = child_Node;
                    map.put(parent_Node, arr);
                }
            }

            set.add(child_Node);
        }

        for(int i = 0; i < descriptions.length; i++){
            if(!set.contains(descriptions[i][0])){
                parentNodeVal = descriptions[i][0];
                break;
            }
        }

        TreeNode head = new TreeNode(parentNodeVal);
        createBT(descriptions, head);
        return head;
    }
}
