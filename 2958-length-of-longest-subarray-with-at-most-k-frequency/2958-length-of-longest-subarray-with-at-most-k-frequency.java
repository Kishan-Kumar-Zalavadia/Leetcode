class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 1;
        int n = nums.length;
        int i = 0; 
        int j = 1;
        map.put(nums[0], 1);
        while(j<n) {
            int num = nums[j];
            map.put(num, map.getOrDefault(num,0)+1);
            while (map.get(num) > k) {
                map.put(nums[i], map.get(nums[i])-1);
                i++;
            }
            j++;
            ans = Math.max(ans, j-i);
        }
        return ans;
    }
}