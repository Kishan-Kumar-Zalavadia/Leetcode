class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] arr = new int[n+1];
        int[] ans = new int[n];

        for (int i=0;i<n;i++) {
            ans[i] = i > 0 ? ans[i-1] : 0;
            arr[A[i]]++;
            if (arr[A[i]] == 2) {
                ans[i]++;
            }
            arr[B[i]]++;
            if (arr[B[i]] == 2) {
                ans[i]++;
            }
        }
        return ans;
    }
}