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
        int[] ans = new int[2];
        ans[1] = -1;
        ans[0] = Integer.MAX_VALUE;
        
        ListNode prev = head;
        ListNode curr = prev.next;
        ListNode nxt = curr.next;
        int index = 1;
        int firstIndex = -1;
        int currIndex = -1;

        while (nxt != null) {
            if ((curr.val < prev.val && curr.val < nxt.val) 
            || (curr.val > prev.val && curr.val > nxt.val)) {
                if (firstIndex == -1) {
                    firstIndex = index;
                    currIndex = index;
                } else {
                    ans[0] = Math.min(ans[0], index - currIndex);
                    currIndex = index;
                }
            }

            prev = prev.next;
            curr = curr.next;
            nxt = nxt.next;
            index++;
        }
        if (firstIndex != -1 && firstIndex != currIndex) {
            ans[1] = currIndex - firstIndex;
        }
        if (ans[0] == Integer.MAX_VALUE) {
            ans[0] = -1;
        }
        return ans;
    }
}