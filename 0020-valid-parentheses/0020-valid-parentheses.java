class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else {
                switch(ch) {
                    case ')' : if (!(!st.isEmpty() && st.pop() == '('))
                        return false;
                        break;
                    case ']' : if (!(!st.isEmpty() && st.pop() == '['))
                        return false;
                        break;
                    case '}' : if (!(!st.isEmpty() && st.pop() == '{'))
                        return false;
                        break;
                }
            }
        }
        if (st.isEmpty()) {
            return true;
        }
        return false;
    }
}