class Solution {
    
    int[] dp = new int[10001];
    
    public int maxJumps(int[] arr, int d) {
        int ans = 1;
        Arrays.fill(dp, -1);
        for (int i=0; i< arr.length; i++) {
            ans = Math.max(ans,recurssion(arr, d, i));
        }
        return ans;
    }
    public int recurssion(int[] arr, int d, int i) {
        if (dp[i] != -1){
            return dp[i];
        }
        int n=arr.length;
        int ans=1;

        for (int j=i+1; j<=Math.min(n-1, i+d); j++) {
            if (arr[j] >= arr[i]) {
                break;
            }
            ans = Math.max(ans, 1+recurssion(arr, d, j));
        }

        for (int j=i-1; j>=Math.max(0, i-d); j--) {
            if (arr[j] >= arr[i]) {
                break;
            }
            ans = Math.max(ans, 1+recurssion(arr, d, j));
        }
        
        return dp[i] = ans;
    }
}