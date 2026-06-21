class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int[] freq = new int[100001];
        for (int cost : costs) {
            freq[cost]++;
        }
        int ans = 0;
        for (int i = 1; i < freq.length; i++) {
            if (i > coins) break;
            int canBuy = Math.min(freq[i], coins / i);
            ans += canBuy;
            coins -= canBuy * i;
        }
        return ans;
    }
}