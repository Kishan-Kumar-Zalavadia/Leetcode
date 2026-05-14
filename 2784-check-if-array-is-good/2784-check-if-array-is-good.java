// My Solution
class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            if (nums[i]>n-1) {
                return false;
            }
            if (arr[nums[i]] == 1) {
                if (nums[i] != n-1) {
                    return false;
                }
            } else if (arr[nums[i]] == 2) {
                return false;
            }
            arr[nums[i]]++;
        }
        return true;
    }
}