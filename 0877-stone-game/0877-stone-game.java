class Solution {
    public boolean stoneGame(int[] piles) {
        int sum = 0;
        int n = piles.length;
        int[][] dp = new int[n][n];
        for (int i=0; i<piles.length; i++){
            sum += piles[i];
        }
        int aliceScore = recurssion(piles, 0, n-1, dp);
        return aliceScore > (sum-aliceScore);
    }

    public int recurssion(int[] piles, int i, int j, int[][] dp) {
        if (i>j) {
            return 0;
        }
        if (dp[i][j] != 0 ) {
            return dp[i][j];
        }
        int aliceScore = Math.max(
            piles[i] + Math.min(recurssion(piles, i+2, j, dp), recurssion(piles, i+1, j-1, dp)),
            piles[j] + Math.min(recurssion(piles, i+1, j-1, dp), recurssion(piles, i, j-2, dp))
        );
        dp[i][j] = aliceScore;
        return aliceScore;
    }
}