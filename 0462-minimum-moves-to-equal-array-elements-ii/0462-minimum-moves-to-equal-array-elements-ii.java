class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int val = nums[n/2];
        int count = 0;
        for (int num: nums) {
            count += Math.abs(num-val);
        }
        return count;
    }
}