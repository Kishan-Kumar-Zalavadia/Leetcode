class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<String>();
        StringBuilder str = new StringBuilder();
        helper(str, ans, n, n);
        return ans;
    }
    public void helper(StringBuilder str, List<String> ans, int open, int close) {
        if (close == 0 && open == 0) {
            ans.add(str.toString());
            return;
        }
        if (open > 0) {
            str.append('(');
            helper(str, ans, open-1, close);
            str.deleteCharAt(str.length()-1);
        }
        if (close > open){
            str.append(')');
            helper(str, ans, open, close-1);
            str.deleteCharAt(str.length()-1);
        }
    }
}