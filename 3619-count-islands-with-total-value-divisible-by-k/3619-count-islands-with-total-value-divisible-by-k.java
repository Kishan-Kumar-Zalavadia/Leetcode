class Solution {
    public long helper(int[][] grid, int k, int[][] visited, int n, int m, long sum, int ans) {
        if (n>=grid.length || m>=grid[0].length || n<0 || m<0) {
            return sum;
        }
        if (grid[n][m] == 0 || visited[n][m] == 1) {
            return sum;
        }
        visited[n][m] = 1;
        sum += grid[n][m];

        sum = helper(grid, k, visited, n, m+1, sum, ans);
        sum = helper(grid, k, visited, n, m-1, sum, ans);
        sum = helper(grid, k, visited, n-1, m, sum, ans);
        sum = helper(grid, k, visited, n+1, m, sum, ans);
        
        return sum;
    }
    public int countIslands(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];
        int ans = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (grid[i][j] != 0 && visited[i][j] != 1) {
                    ans = helper(grid, k, visited, i, j, 0, ans) % k == 0 ? ans+1 : ans;
                    
                }
            }
        }
        return ans;
    }
}