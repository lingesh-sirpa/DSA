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

    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode next_Node = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next_Node;
        }
        return prev;
    }

    public int pairSum(ListNode head) {
        ListNode sp = head; ListNode fp = head;
        while(fp != null && fp.next != null){
            fp = fp.next.next;
            sp = sp.next;
        }
        ListNode secondHead = reverse(sp);
        ListNode t1 = head; ListNode t2 = secondHead;
        int maxTwinSum = 0;
        while(t1 != null && t2 != null){
          maxTwinSum = Math.max(maxTwinSum, t1.val + t2.val);
          t1 = t1.next; t2 = t2.next;
        }
        
        return maxTwinSum;
    }
}
