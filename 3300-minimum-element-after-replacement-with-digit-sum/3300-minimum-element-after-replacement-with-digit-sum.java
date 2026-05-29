class Solution {
    public int minElement(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for (int i=0 ;i<nums.length; i++) {
            int num = nums[i];
            int tempSum = 0;
            while (num != 0) {
                int x = num%10;
                tempSum += x;
                num /= 10;
            }
            ans = Math.min(ans, tempSum);
        }
        return ans;
    }
}