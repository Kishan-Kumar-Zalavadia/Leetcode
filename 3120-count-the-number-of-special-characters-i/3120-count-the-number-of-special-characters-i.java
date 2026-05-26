class Solution {
    public int numberOfSpecialChars(String word) {
        int ans = 0;
        int[] small = new int[26];
        int[] big = new int[26];
        for (int i=0;i<word.length();i++) {
            int val = word.charAt(i)-'a';
            if (val < 0) {
                big[word.charAt(i)-'A'] = 1;
            } else {
                small[val] = 1;
            }
        }

        for (int i=0;i<26;i++) {
            if (small[i] == 1 && big[i]==1) {
                ans++;
            }
        }
        return ans;
    }
}