class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc = 0;
        int dec = 0;
        int ans = 0;

        for (int i=1; i<nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                dec = 0;
                inc++;
            } else if (nums[i] < nums[i-1]) {
                inc = 0;
                dec++;
            } else {
                dec = 0;
                inc = 0;
            }
            ans = Math.max(ans, Math.max(inc, dec));
        }
        return ans+1;
    }
}