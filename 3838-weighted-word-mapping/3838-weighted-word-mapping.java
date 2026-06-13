class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String ans = "";
        int n = words.length;
        for (int i=0; i<n; i++) {
            int len = words[i].length();
            int sum = 0;
            for (int j=0; j<len; j++) {
                sum += weights[words[i].charAt(j) - 'a'];
            }
            sum %= 26;
            sum = 25 - sum;
            ans += (char)(sum + 'a');
        }
        return ans;
    }
}