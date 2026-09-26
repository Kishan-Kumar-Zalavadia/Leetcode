class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map = new HashMap<>();
        for (int i=0; i<knowledge.size(); i++) {
            map.put(knowledge.get(i).get(0), knowledge.get(i).get(1));
        }

        StringBuilder ans = new StringBuilder();
        int n = s.length();
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(') {
                int closingBracketIndex = s.indexOf(")", i+1);
                String key = s.substring(i+1, closingBracketIndex);
                ans.append(map.getOrDefault(key, "?"));
                i = closingBracketIndex;

            } else {
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}