class Solution {
    public boolean checkValidString(String s) {
        int min = 0, max = 0;

        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                min++;
                max++;
            } else if (c == ')') {
                min--;
                max--;
            } else { // '*' forks: ')', '', '('
                min--;
                max++;
            }

            // no valid path remains
            if (max < 0) return false; 

            // clip negative-balance paths
            min = Math.max(min, 0); 
        }

        // ∃ path ends with balance 0
        return min == 0; 
    }   
}