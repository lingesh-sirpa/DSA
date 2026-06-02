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

    public int reverse(ListNode head, int count, int ans){
        if(head == null){
            return ans;
        }
        if(head.val == 1){
            ans = ans + (int) Math.pow(2, count);
        }
        return reverse(head.next, count - 1, ans);
    }
    public int getDecimalValue(ListNode head) {
        int count = -1;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
       return reverse(head, count, 0);
    }
}
