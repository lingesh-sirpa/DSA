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
    public ListNode removeNthFromEnd(ListNode head, int n) {
      if(head == null || head.next == null){
        return null;
      }
      int t = 0; 
      ListNode temp = head;
      while(temp != null){
        t++;
        temp = temp.next;
      }  
      int tar = t - n;
      temp = head; int i = 1;
      if(tar == 0){
         head = head.next;
      }
      while(temp != null && temp.next != null && i < tar){
        temp = temp.next; i++;
      }
      temp.next = temp.next.next;
      return head;
    }
}
