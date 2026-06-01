class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int ans = 0;
        int n = cost.length;

        int counter = 0;
        for (int i=n-1; i>=0; i--) {
            counter++;
            if (counter == 3) {
                counter = 0;
                continue;
            }
            ans += cost[i];
        }
        return ans;
    }
}