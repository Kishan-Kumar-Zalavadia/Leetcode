class Solution {
    public int support(int[] ls, int[] ld, int[] ws, int[] wd) {
        int minEnd = Integer.MAX_VALUE;
        for (int i=0; i<ls.length; i++) {
            minEnd = Math.min(minEnd, ls[i] + ld[i]);
        }
        int ans = Integer.MAX_VALUE;
        for (int i=0; i<ws.length; i++) {
            ans = Math.min(ans, Math.max(minEnd, ws[i]) + wd[i]);
        }
        return ans;
    }

    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int landFirst = support(landStartTime, landDuration, waterStartTime, waterDuration);
        int waterFirst = support(waterStartTime, waterDuration, landStartTime, landDuration);
        return Math.min(landFirst, waterFirst);   
    }
}