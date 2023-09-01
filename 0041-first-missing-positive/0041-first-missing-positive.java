class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length; // Check which number is missing from 1 to n
        for(int i=0;i<nums.length;i++){
            int element = nums[i];
            int chair = element-1;  // element should sit on ()element-1)th chair
            if(element>=1 && element<=n){
            if(nums[chair]!=element){ 
                //if element is not sitting on its currect position, then make it sit on its correct position by swapping
                int temp = nums[chair];
                nums[chair] = nums[i];
                nums[i] = temp;
                i--;
            }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i+1 != nums[i])
                return i+1;
        }
        return n+1;
    }
}