class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int i=0;
        while (i<nums.length && nums[i] != target) {
            i++;
        }
        while (i<nums.length && nums[i] == target) {
            ans.add(i);
            i++;
        }
        return ans;
    }
}