class Solution {
    public int largestInteger(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<=nums.length-k; i++){
            Set<Integer> set = new HashSet<>();
            for(int j=i; j<k+i; j++)
                set.add(nums[j]);
            for(int n:set)
                map.put(n, map.getOrDefault(n,0)+1);
        }
        int max = -1;
        for(int n: map.keySet())
            if(map.get(n)==1)
                max = Math.max(max, n);

        return max;
    }
}