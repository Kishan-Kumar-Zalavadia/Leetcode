class Solution {
    public int numberOfSpecialChars(String word) {
        int ans = 0;
        int n= word.length();
        int[] small = new int[26];
        int[] big = new int[26];
        for (int i=0; i<n; i++) {
            int val = word.charAt(i) - 'a';
            if (val < 0) {
                // Capital
                val = word.charAt(i) - 'A';
                if (big[val] == 0) {
                    big[val] = i+1;
                }
            } else {
                // Small
                small[val] = i+1;
            }
        }


        for (int i=0; i<26; i++) {
            if (small[i] != 0 && big[i] != 0 && small[i] < big[i]) {
                ans++;
            }
        }
        return ans;
    }
}