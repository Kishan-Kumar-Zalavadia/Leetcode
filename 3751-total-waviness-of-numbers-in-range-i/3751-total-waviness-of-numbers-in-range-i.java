// My Solution
class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;
        for (int num=num1; num<=num2; num++) {
            ans += peaksAndValleys(num);
        }
        return ans;
    }
    public int peaksAndValleys(int num) {
        int count=0;
        if (num < 100) {
            return 0;
        }
        while (num > 99) {
            int next = num%10;
            int curr = (num%100)/10;
            int prev = (num%1000)/100;
            if ((next<curr && prev<curr) || (next>curr && prev>curr)) {
                count++;
            }
            num = num/10;
        }
        return count;
    }
}