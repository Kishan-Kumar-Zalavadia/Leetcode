class Solution {
    public int maxProduct(int n) {
        int maxDigit = n%10;
        int secondMax = -1;
        n = n/10;
        while (n!=0) {
            int digit = n%10;
            if (digit >= maxDigit) {
                secondMax = maxDigit;
                maxDigit = digit;
            } else if (digit >= secondMax) {
                secondMax = digit;
            }
            n = n/10;
        }
        return maxDigit * secondMax;
    }
}