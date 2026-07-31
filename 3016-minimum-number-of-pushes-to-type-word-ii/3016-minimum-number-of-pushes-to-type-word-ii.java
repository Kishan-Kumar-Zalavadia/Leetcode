class Solution {
    public int minimumPushes(String word) {
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int n = word.length();
        for (int i=0; i<n; i++) {
            char ch = word.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        LinkedHashMap<Character, Integer> sortedMap = map.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .collect(Collectors.toMap(
            Map.Entry::getKey,
            Map.Entry::getValue,
            (oldValue, newValue) -> oldValue,
            LinkedHashMap::new
        ));
        System.out.println(sortedMap);

        Iterator<Map.Entry<Character, Integer>> iterator = sortedMap.entrySet().iterator();

        int count = 8;
        int pressTimes = 1;
        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> entry = iterator.next();
            int key = entry.getKey();
            int val = entry.getValue();
            ans += pressTimes*val;
            count--;
            if (count == 0) {
                pressTimes++;
                count = 8;
            }
        }

        return ans;
    }
}