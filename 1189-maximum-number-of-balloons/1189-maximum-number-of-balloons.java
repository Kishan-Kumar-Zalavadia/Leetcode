class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] ch = new int[26];
        int n = text.length();
        for (int i=0;i<n;i++) {
            ch[text.charAt(i)-'a']++;
        }
        int ans = ch[0];
        ans = Math.min(ans, ch[1]);
        ans = Math.min(ans, ch[11]/2);
        ans = Math.min(ans, ch[13]);
        ans = Math.min(ans, ch[14]/2);

        return ans;
    }
}   