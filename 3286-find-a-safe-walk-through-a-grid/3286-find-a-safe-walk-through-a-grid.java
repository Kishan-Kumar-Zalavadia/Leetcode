class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m = grid.size(), n = grid.get(0).size();
        // visited[r][c] = max health we've arrived here with (higher = better)
        int[][] best = new int[m][n];  
        
        Queue<int[]> queue = new LinkedList<>();
        int startHealth = health - grid.get(0).get(0);
        if (startHealth <= 0) return false;
        
        queue.offer(new int[]{0, 0, startHealth});
        best[0][0] = startHealth;
        
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int r = curr[0], c = curr[1], hp = curr[2];
            
            if (r == m-1 && c == n-1) return true;
            
            for (int[] d : dirs) {
                int nr = r + d[0], nc = c + d[1];
                if (nr < 0 || nr >= m || nc < 0 || nc >= n) continue;
                
                int nhp = hp - grid.get(nr).get(nc);
                // Only visit if health is positive AND better than before
                if (nhp > 0 && nhp > best[nr][nc]) {
                    best[nr][nc] = nhp;
                    queue.offer(new int[]{nr, nc, nhp});
                }
            }
        }
        return false;
    }
}