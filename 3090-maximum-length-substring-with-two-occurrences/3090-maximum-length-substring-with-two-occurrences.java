class Solution {
    public int maximumLengthSubstring(String s) {
        int[] arr = new int[26];
        int st = 0;
        int ans = 0;
        for (int e=0; e<s.length(); e++) {
            int eIndex = s.charAt(e) - 'a';
            arr[eIndex] = arr[eIndex]+1;
            while (arr[eIndex] > 2 && st<=e) {
                int sIndex = s.charAt(st) - 'a';
                arr[sIndex]--;
                st++;
            }
            ans = Math.max(ans, e-st+1);

        }
        return ans;
    }
}