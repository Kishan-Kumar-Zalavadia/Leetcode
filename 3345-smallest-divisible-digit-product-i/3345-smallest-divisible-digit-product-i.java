class Solution {
    public boolean divisible(int n, int t) {
        if (n == 100) {
            return true;
        } else if (n>9 && n< 100) {
            int product = (n/10) * (n%10);
            if (product % t == 0) {
                return true;
            }
        } else if (n % t == 0) {
            return true;
        }
        return false;
    }
    public int smallestNumber(int n, int t) {
        while (true) {
            if (divisible(n, t)) {
                return n;
            }
            n++;
        }
    }
}