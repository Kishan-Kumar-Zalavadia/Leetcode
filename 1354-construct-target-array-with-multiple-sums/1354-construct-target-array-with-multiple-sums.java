class Solution {
    public boolean isPossible(int[] target) {
    long sum = 0;
    PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
    for (int n : target) {
        sum += n;
        q.add(n);
    }        
    while (sum > 1 && q.peek() > sum / 2) {
        int cur = q.poll();
        sum -= cur;
        if (sum <= 1) 
            return sum == 0 ? false : true;
        q.add(cur % (int)sum);
        sum += cur % sum;
    }
    return sum == target.length;
}
}