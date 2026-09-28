class Solution {
    public int maxDepth(String s) {
        int ans = 0;
        int openParentheses = 0;
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                openParentheses++;
                ans = Math.max(ans, openParentheses);
            } else if (ch == ')') {
                openParentheses--;
            }
        }
        return ans;
    }
}