class Solution {
    int[][] dp = new int[501][501];
    public boolean stoneGame(int[] piles) {
        int sum = 0;
        int n = piles.length;
        for (int i=0; i<piles.length; i++){
            sum += piles[i];
        }
        int aliceScore = recurssion(piles, 0, n-1);
        return aliceScore > (sum-aliceScore);
    }

    public int recurssion(int[] piles, int i, int j) {
        if (i>j) {
            return 0;
        }
        if (dp[i][j] != 0 ) {
            return dp[i][j];
        }
        int aliceScore = Math.max(
            piles[i] + Math.min(recurssion(piles, i+2, j), recurssion(piles, i+1, j-1)),
            piles[j] + Math.min(recurssion(piles, i+1, j-1), recurssion(piles, i, j-2))
        );
        dp[i][j] = aliceScore;
        return aliceScore;
    }
}