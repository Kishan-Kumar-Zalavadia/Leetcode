class Solution {
    public int updateAns(int[] arr, int ans) {
        int count = 0;
        for (int j=0 ;j<101; j++) {
            if (arr[j] != 0){
                count++;
            }
        }
        ans += count * count;
        return ans;
    }
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int ans = n;
        int currentSize = 2;
        while (currentSize <= n) {
            int prev = 0;
            int[] arr = new int[101];
            for (int i=0; i<n; i++) {
                if (i<currentSize) {
                    arr[nums.get(i)]++;
                    if (i == currentSize-1) {
                        ans = updateAns(arr, ans);
                    }
                } else {
                    arr[nums.get(prev)]--;
                    arr[nums.get(i)]++;
                    prev++;
                    ans = updateAns(arr, ans);
                }
            }
            currentSize++;
        }
        return ans;
    }
}