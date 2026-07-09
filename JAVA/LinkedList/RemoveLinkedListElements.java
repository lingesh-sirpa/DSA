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
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        while(head != null && head.next != null && head.val == val){
            head = head.next;
        }
        if(head != null && head.next == null && head.val == val){
            head = null;
            return head;
        }
    
        ListNode t1 = head;  ListNode t2 = null;
        while(t1 != null){

           if(t1.val == val && t1.next != null){
              ListNode next_Node = t1.next;
              t2.next = next_Node;
              t1 = next_Node;
           }else if(t1.val == val && t1.next == null){
              t2.next = null;
              t1 = null;
           }else{
              t2 = t1;
              t1 = t1.next;
           }

        }

      return head;
    }
}
