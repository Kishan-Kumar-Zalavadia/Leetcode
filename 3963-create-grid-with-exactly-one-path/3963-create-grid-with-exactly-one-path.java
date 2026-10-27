class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans = new String[m];
        ans[0] = ".".repeat(n);
        String str = "#".repeat(n-1);
        str += '.';
        for (int i=1; i<m; i++) {
            ans[i] = str;
        }
        return ans;
    }
}