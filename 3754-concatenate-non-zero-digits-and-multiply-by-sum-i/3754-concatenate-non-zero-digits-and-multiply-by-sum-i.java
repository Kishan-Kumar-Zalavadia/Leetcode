class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        long x = 0;
        while (n!=0) {
            int temp = n%10;
            sum += temp;
            if (temp != 0) {
                x = x*10 + temp;
            }
            n = n/10;
        }
        long m = 0;
        while (x!=0) {
            long temp = x%10;
            m = m*10 + temp;
            x = x/10;
        }
        return sum*m;
    }
}