class Solution {
    public int[] leftRightDifference(int[] nums) {
        int rightSum = 0;
        for (int num : nums) {
            rightSum+=num;
        }
        int leftSum = 0;
        for (int i=0; i<nums.length; i++) {
            int val = nums[i];
            rightSum -= val;
            nums[i] = Math.abs(rightSum-leftSum);
            leftSum += val;
        }
        return nums;
    }
}