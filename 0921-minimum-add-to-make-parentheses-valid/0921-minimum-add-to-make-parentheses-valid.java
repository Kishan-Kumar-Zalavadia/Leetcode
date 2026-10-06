class Solution {
    public int minAddToMakeValid(String s) {
        int ans = 0;
        Stack<Character> st = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ')' && !st.isEmpty() && st.peek() == '(') {
                st.pop();    
            } else {
                st.push(ch);
            }
        }
        while(!st.isEmpty()) {
            ans++;
            st.pop();
        }
        return ans;
    }
}