class Solution {
    public String processStr(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                ans.append(ch);
            } else if (ch == '*' && ans.length() > 0) {
                ans.setLength(ans.length()-1);
            } else if (ch == '#') {
                ans = ans.append(ans);
            } else if (ch == '%') {
                ans = ans.reverse();
            }
        }
        return ans.toString();
    }
}