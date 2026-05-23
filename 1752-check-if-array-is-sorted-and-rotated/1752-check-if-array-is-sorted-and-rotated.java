// My Solution
class Solution {
    public boolean check(int[] nums) {
        int rotate = 0;
        int n = nums.length;
        int val = nums[0];
        for (int i=1; i<n;i++) {
            if (nums[i] < nums[i-1]) {
                rotate++;
                
            }
            if (rotate > 1) {
                    return false;
                }
                if (rotate == 1) {
                    if (nums[i] > val) {
                        return false;
                    }
                }
        }
        return true;
    }
}