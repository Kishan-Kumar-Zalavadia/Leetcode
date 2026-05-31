// My Solution
class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int ast : asteroids) {
            q.offer(ast);
        }
        long currMass = mass;
        while (!q.isEmpty() && q.peek() < mass) {
            currMass += q.poll();
        }
        if (q.isEmpty()) {
            return true;
        }
        while (!q.isEmpty()) {
            if (q.peek() > currMass) {
                return false;
            }
            currMass += q.poll();
        }
        return true;
    }
}