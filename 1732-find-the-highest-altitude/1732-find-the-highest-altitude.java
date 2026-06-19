class Solution {
    public int largestAltitude(int[] gain) {
        int high = 0;
        int current = 0;
        for(int i=0;i<gain.length;i++){
            current +=gain[i];
            high = Math.max(high, current);
        }
        return high;
    }
}