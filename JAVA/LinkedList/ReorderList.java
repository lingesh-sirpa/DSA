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
    public void reorderList(ListNode head) {

        ListNode t1 = head;
        while(t1.next != null && t1.next.next != null){
           ListNode t2 = t1;
           while(t2.next != null && t2.next.next != null){
               t2 = t2.next;
           }
           ListNode lastNode = t2.next;
           t2.next = null;
           ListNode nextNodeOft1 = t1.next;
           t1.next = lastNode;
           lastNode.next = nextNodeOft1;
           t1 = nextNodeOft1;
        }
        
    }
}
