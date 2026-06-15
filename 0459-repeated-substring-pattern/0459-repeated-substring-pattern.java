class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for(int i=1; i<s.length();i++){
            String subString = s.substring(0,i);
            if (n%i == 0) 
            if (s.equals(subString.repeat(n/i))) {
                return true;
            }
        }
        return false;
    }
}