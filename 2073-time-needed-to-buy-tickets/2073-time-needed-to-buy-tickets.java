// My Solution
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length;
        int ans = 0;
        for (int i=0;i<n;i++) {
            if (tickets[k] > 1) {
                if (i>k) {
                    ans += Math.min(tickets[i], tickets[k]-1);
                } else {
                    ans += Math.min(tickets[i], tickets[k]);
                }
            } else {
                if (i>k) {
                    break;
                }
                ans += Math.min(tickets[i], tickets[k]);
            }
        }
        return ans;
    }
}