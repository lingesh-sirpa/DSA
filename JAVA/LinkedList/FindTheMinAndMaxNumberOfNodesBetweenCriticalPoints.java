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
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        List<Integer> cps = new ArrayList<>();
        int[] ans = {-1, -1};
        ListNode prev = head;
        ListNode curr = head.next;
        int idx = 2;
        while(curr != null && curr.next != null){
            if(prev.val < curr.val && curr.val > curr.next.val){
                cps.add(idx);
            }
            if(prev.val > curr.val && curr.val < curr.next.val){
                cps.add(idx);
            }
            idx++;
            curr = curr.next;
            prev = prev.next;
        }

        if(cps.size() < 2){
            return ans;
        }
        
        int minDist = Integer.MAX_VALUE;
        for(int i = 0; i < cps.size() - 1; i++){
            if(cps.get(i + 1) - cps.get(i) < minDist){
                minDist = cps.get(i + 1) - cps.get(i);
            }
        }

        ans[0] = minDist;
        ans[1] = cps.get(cps.size() - 1) - cps.get(0);

        return ans;
    }
}
