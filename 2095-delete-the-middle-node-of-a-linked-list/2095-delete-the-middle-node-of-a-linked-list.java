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
    public ListNode deleteMiddle(ListNode head) {
        int count = 0;
        ListNode curr = head;
        while(curr!=null){
            count++;
            curr = curr.next;
        }
        count/=2;
        if(count<1){
            curr = null;
            return curr;
        }
        curr = head;
        for(int i=0;i<count-1;i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
                
        return head;
    }
}