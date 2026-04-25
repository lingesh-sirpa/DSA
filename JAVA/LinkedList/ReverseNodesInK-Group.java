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
    public ListNode reverse(ListNode a){
        ListNode curr = a; ListNode prev = null;
        while(curr != null){
            ListNode nNext = curr.next;
            curr.next = prev;
            prev = curr; 
            curr = nNext;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
         if(head == null){
            return null;
         }
         if(k == 1){
            return head;
         }
         ListNode t = head; int i=0;
         while(t != null && t.next != null && i++ < k-1){
             t = t.next;
         }
         if(i < k-1){
            return head;
         }
         ListNode nn = t.next; t.next = null;
         ListNode a = reverse(head);
         ListNode h = a;
         while(h != null && h.next != null){
            h = h.next;
         }
         ListNode p = reverseKGroup(nn,k);
         h.next = p;
         return a;
    }
}
