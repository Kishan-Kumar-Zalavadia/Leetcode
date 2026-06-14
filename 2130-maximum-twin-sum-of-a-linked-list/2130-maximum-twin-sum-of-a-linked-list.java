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
    public int pairSum(ListNode head) {
        ListNode start = head;
        ListNode end = head;
        int count = 0;
        int sum = 0, maxSum =0;
        while(end.next!=null){
            count++;
            end = end.next;
        }
        end = head;
        for(int i=0;i<count/2;i++){
            end = end.next;
        }
        ListNode temp = end;
        end = end.next;
        temp.next = null;

        ListNode prev = null;  
        ListNode current = end;    
        while(current != null) { 
            ListNode next = current.next; 
            current.next = prev;
            prev = current;
            current = next;
        }
        end = prev;
        while(start!=null || end!=null){
            sum = start.val + end.val;
            maxSum = Math.max(sum, maxSum);
            start = start.next;
            end = end.next;
        }
        
        return maxSum;
    }
}