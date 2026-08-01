class Solution {
    int[][] arr = new int[23][23];
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i=0;i<n;i++) {
            sum+=nums[i];
        }
        
        int p1 = recurssion(nums, 0, n-1);
        return p1>= (sum-p1);
    }

    public int recurssion(int[] nums, int s, int e) {
        if (s>e) return 0;
        if (arr[s][e] != 0) {
            return arr[s][e];
        }
        int val = Math.max(
            nums[s] + Math.min(
                recurssion(nums, s+2, e),
                recurssion(nums, s+1, e-1)
            ),
            nums[e] + Math.min(
                recurssion(nums, s, e-2),
                recurssion(nums, s+1, e-1)
            )
        );

        arr[s][e] = val;
        return val;
    }
}