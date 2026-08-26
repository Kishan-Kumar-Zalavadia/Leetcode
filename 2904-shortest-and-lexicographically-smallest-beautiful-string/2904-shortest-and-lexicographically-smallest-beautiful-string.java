class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String smallest = "a";
        for (int i=0; i<s.length()-k+1;i++) {
            int count = 0;
            String str2 = "";
            boolean flag = false;
            for (int j=i; j<s.length(); j++) {
                str2+=s.charAt(j);
                if (s.charAt(j) == '1') {
                    count++;
                }
                if (count == k){
                    flag = true;
                    break;
                }
            }
            if (!flag)
                continue;
            if (smallest.equals("a"))
                smallest = str2;
            if (smallest.length() == str2.length())
                smallest = (smallest.compareTo(str2) <= 0) ? smallest : str2;
            else
                smallest = (smallest.length()<str2.length()) ? smallest : str2;
        }
        return smallest.equals("a") ? "" : smallest;
    }
}