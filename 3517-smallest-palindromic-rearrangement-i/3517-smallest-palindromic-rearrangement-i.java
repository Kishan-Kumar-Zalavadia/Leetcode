class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        char[] chars = s.substring(0,n/2).toCharArray();
        Arrays.sort(chars);
        return new String(chars) + (n%2 != 0 ? s.charAt(n/2) : "") + new StringBuilder(new String(chars)).reverse();
    }
}