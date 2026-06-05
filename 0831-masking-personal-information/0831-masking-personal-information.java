// My Solution
class Solution {
    public String maskPII(String s) {
        int n = s.length();
        int astricIndex = s.indexOf('@');
        int dotIndex = s.indexOf('.');

        if (astricIndex != -1 && dotIndex != -1) {
            StringBuilder ans = new StringBuilder(s);
            ans.replace(1, astricIndex-1, "*****");
            return ans.toString().toLowerCase();
        } else {
            StringBuilder ans = new StringBuilder();
            int count = 0;
            String countryCode = "";
            for (int i=n-1; i>=0; i--) {
                char ch = s.charAt(i);
                if (Character.isDigit(ch)) {
                    if (count < 4) {
                        ans.append(ch);
                    } else if (count >= 10) {
                        countryCode+='*';
                    }
                    count++;
                }
            }
            ans.append("-***-***");
            if (countryCode.length()>0) {
                countryCode = "-"+countryCode+"+";
                ans.append(countryCode);
            }
            return ans.reverse().toString();
        }
    }
}