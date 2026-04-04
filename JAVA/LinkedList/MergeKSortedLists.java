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
    public ListNode mergeKLists(ListNode[] lists) {
       if(lists == null || lists.length == 0){
        return null;
       }
       if(lists.length == 1){
        return lists[0];
       }
       int i = 1; ListNode d1 = new ListNode(-1);
       ListNode a = lists[0];
       while(i < lists.length){
        ListNode c1 = d1;
        ListNode b = lists[i];
        while(a != null && b != null){
            if(a.val < b.val){
                c1.next = a;
                c1 = c1.next;
                a = a.next;
            }
            else{
                c1.next = b; 
                c1 = c1.next;
                b = b.next;
            }
        }
         if(a != null){
            c1.next = a;
            c1 = c1.next; 
            a = a.next;
         }
         if(b != null){
            c1.next = b;
            c1 = c1.next;
            b = b.next;
         }
         a = d1.next; i++;
       }
      
       return d1.next;
    }
}
