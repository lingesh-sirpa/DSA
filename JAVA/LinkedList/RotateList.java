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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode t = head; int te = 0;
        while(t != null){
            te++; t = t.next;
        }
        if(k == te){
            return head;
        }
        if(k > te){
            k = k % te;
        }
        if(k < 0){
            k = k + te;
        }
        if(k == 0){
            return head;
        }
        int tar = te - k;
        t = head; int i = 1;
        while(t != null && i < tar){
           t = t.next; i++;
        }
        ListNode a = t.next;
        ListNode v = a;
        while(v != null && v.next != null){
            v = v.next;
        }
        v.next = head; t.next = null;
        return a;
    }
}
