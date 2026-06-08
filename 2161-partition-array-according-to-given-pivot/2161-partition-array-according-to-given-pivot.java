class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        int left = 0, right = nums.length - 1;
        
        for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
            if (nums[i] < pivot) {
                result[left] = nums[i];
                left++;
            }
            
            if (nums[j] > pivot) {
                result[right] = nums[j];
                right--;
            }
        }
        
        while (left <= right) {
            result[left] = pivot;
            left++;
        }
        
        return result;
    }
}
// **************** My Solution ******************
// class Solution {
//     public int[] pivotArray(int[] nums, int pivot) {
//         List<Integer> small = new ArrayList<>();
//         List<Integer> large = new ArrayList<>();
//         int count = 0;
//         int[] res = new int[nums.length];

//         for(int i=0; i<nums.length; i++){
//             if(nums[i]>pivot)
//                 large.add(nums[i]);
//             else if(nums[i]<pivot)
//                 small.add(nums[i]);
//             else
//                 count++;
//         }
//         int k=0;
//         for(int i=0; i<small.size();i++,k++){
//             res[k] = small.get(i);
//         }
//         while(count!=0){
//             res[k++] = pivot;
//             count--;
//         }
//         for(int i=0; i<large.size();i++,k++){
//             res[k] = large.get(i);
//         }

//         return res;
//     }
// }