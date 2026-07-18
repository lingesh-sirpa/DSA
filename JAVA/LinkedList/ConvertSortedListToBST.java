/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    
    public TreeNode conSLToBST(ListNode head){
        if(head == null){
          return null;
        }
        ListNode fp = head; ListNode sp = head;
        ListNode spBeforeNode = null;
        while(fp != null && fp.next != null){
           fp = fp.next.next;
           spBeforeNode = sp;
           sp = sp.next;
        }
        TreeNode root = new TreeNode(sp.val);
        if(spBeforeNode != null){
          spBeforeNode.next = null;
        }
        if(spBeforeNode != null){
         root.left = conSLToBST(head);
        }
        if(sp.next != null){
         root.right = conSLToBST(sp.next);
        }
        return root;
    }

    public TreeNode sortedListToBST(ListNode head) {
        return conSLToBST(head);
    }
}
