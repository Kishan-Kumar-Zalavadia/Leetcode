class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] arr = new int[51];
        int n = nums.length;
        for (int i=0 ;i<n; i++) {
                arr[nums[i]]++;
        }

        for (int i=50; i>=0; i--) {
            if (k==1) {
                System.out.println('1');
                if (arr[i] == 1)
                return i;
            } else if (k == n) {
                System.out.println('2');
                if (arr[i] > 0) 
                return i;
            } else {
                System.out.println('3');
                if (nums[n-1] > nums[0]) {
                    if (arr[nums[n-1]] == 1) 
                    return nums[n-1];
                    if (arr[nums[0]] == 1) 
                    return nums[0];
                } else {
                    if (arr[nums[0]] == 1) 
                    return nums[0];
                    if (arr[nums[n-1]] == 1) 
                    return nums[n-1];
                }
            }
        }
        return -1;
    }
}