class Solution {
    public int minMoves(int[] nums) {
        int minElement = Integer.MAX_VALUE;
        for (int num: nums) {
            minElement = Math.min(minElement, num);
        }

        int moves = 0;
        for (int num: nums) {
            moves += num - minElement;
        }
        return moves;
    }
}