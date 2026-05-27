class Solution {
    public int numberOfSpecialChars(String word) {
        int ans = 0;
        int n= word.length();
        int[] small = new int[26];
        int[] big = new int[26];
        for (int i=n-1; i>=0; i--) {
            int val = word.charAt(i) - 'a';
            if (val < 0) {
                // Captital
                val = word.charAt(i) - 'A';
                if (small[val] == 0) {
                    big[val] = 1;
                }
                else if(small[val] == 1) {
                    big[val] = -1;
                }

            } else {
                // Small
                if (big[val] == 1) {
                    small[val] = 1;
                } else if (big[val] == 0) {
                    small[val] = -1;
                }
            }
        }

        for (int i=0; i<26; i++) {
            if (small[i] == 1 && big[i] == 1) {
                ans++;
            }
        }
        return ans;
    }
}