class Solution {
    public int[] leftRightDifference(int[] nums) {
        int len = nums.length;
        int[] rez = new int[len];
        int total = 0;

        for (int num : nums) {
            total += num;
        }

        int left = 0;

        for (int i = 0; i < len; i++) {
            total -= nums[i];
            int diff = left - total;
            rez[i] = diff < 0 ? -diff : diff;
            left += nums[i];
        }

        return rez;
    }
}