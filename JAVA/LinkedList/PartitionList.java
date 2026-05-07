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
    public ListNode partition(ListNode head, int x) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode h = head;
        ListNode d1 = new ListNode(0); ListNode c1 = d1;
        ListNode d2 = new ListNode(0); ListNode c2 = d2;
        while(h != null){
            ListNode n = new ListNode(h.val);
            if(n.val < x){
                c1.next = n;
                c1 = c1.next;
            }
            else{
                c2.next = n;
                c2 = c2.next;
            }
            h = h.next;
        }
        if(d1.next == null){
            return d2.next;
        }
        if(d2.next == null){
            return d1.next;
        }
        ListNode t = d1.next;
        while(t != null && t.next != null){
            t = t.next;
        }
        t.next = d2.next;
        return d1.next;

    }
}
