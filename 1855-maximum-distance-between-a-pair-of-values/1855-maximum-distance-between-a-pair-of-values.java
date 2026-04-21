class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int ans = 0;
        int l1 = nums1.length;
        int l2 = nums2.length;
        for (int i=0; i<l1; i++) {
            int index = findIndex(nums2, nums1[i], i, nums2.length-1);
            if (index != -1) {
                ans = Math.max(ans, index-i);
            }
        }
        return ans;
    }
    public int findIndex(int[] nums, int val, int l, int r) {
        int n = nums.length;
        int index = -1;
        while (l<=r) {
            int m = (l+r)/2;
            if (val <= nums[m]) {
                index = m;
                l = m+1;
            } else {
                r = m-1;
            }
        }
        return index;
    }
}