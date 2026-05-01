class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int arrSum = 0;
        int currSum = 0;
        for (int i=0;i<n;i++) {
            arrSum+=nums[i];
            currSum += nums[i]*i;
        }
        int ans = currSum;

        for (int i=1;i<n;i++) {
            currSum = currSum + arrSum - nums[n-i]*n;
            ans = Math.max(ans, currSum);
        }
        return ans;
    }
}