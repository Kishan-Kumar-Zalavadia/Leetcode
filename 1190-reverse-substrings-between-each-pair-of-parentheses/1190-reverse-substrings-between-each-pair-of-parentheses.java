class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ')') {
                String sub = "";
                while (!st.isEmpty() && !(st.peek() == '(')) {
                    sub+=st.pop();
                }
                st.pop();
                for (int j=0; j<sub.length(); j++) {
                    st.push(sub.charAt(j));
                }
            }
            else {
                st.push(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}