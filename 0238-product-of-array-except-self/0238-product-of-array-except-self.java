class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int[] ans = new int[nums.length];
        boolean isZero = false;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0)
                prod *= nums[i];
            else if(!isZero)
                isZero = true;
            else
                return ans;
        }
        for(int i=0; i<nums.length; i++){
            if(!isZero){
                ans[i] = prod/nums[i];
            }
            else if(nums[i]!=0)
                ans[i] = 0;
            else if(nums[i] == 0)
                ans[i] = prod;
        }
        return ans;
    }
}