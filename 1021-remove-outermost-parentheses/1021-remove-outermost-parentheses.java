class Solution {
    public String removeOuterParentheses(String s) {
        String ans = "";
        int count = 0;
        char need = '(';
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == need && count == 0) {
                need = need == ')' ? '(' : ')';
                count = ch == ')' ? 0 : count;
                continue; 
            }
            ans += ch;
            count = ch == '(' ? count+1 : count-1;
        }
        return ans;
    }
}