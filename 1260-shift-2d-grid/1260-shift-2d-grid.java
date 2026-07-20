class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length, m = grid[0].length;
        List<List<Integer>> list = new ArrayList<>();
        int[] arr = new int[n*m];
        int l = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                arr[l] = grid[i][j];
                l++;
            }
        }
        k = k % (n*m);
        int[] rotated = new int[n*m];
        
        for (int i = 0; i < n*m; i++) {
            // Formula for right rotation
            rotated[(i + k) % (n*m)] = arr[i];
        }
        l=0;
        for (int i=0; i<n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j=0; j<m; j++) {
                row.add(rotated[l++]);
            }
            list.add(row);
        }
        return list;
    }
}