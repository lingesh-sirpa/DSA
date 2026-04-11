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
    public ListNode reverse(ListNode h){
        ListNode curr = h; ListNode prev = null;
        while(curr != null){
            ListNode nNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nNext;
        }
        return prev;
    }
    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode newHead = head; ListNode n1 = newHead; ListNode n2 = newHead;
        int i = 1;
        while(n2 != null && i++ < 2){
            n2 = n2.next;
        }
        ListNode n3 = n2.next; n2.next = null;
        ListNode a = reverse(n1);
        ListNode t = a;
        while(t.next != null){
            t = t.next;
        }
        ListNode b = swapPairs(n3);
        t.next = b;
        return a;
    }
}
