class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        int sum = 0;
        int res = 0;
        mp.put(0, 1); // ✅ base case

        for(int x : nums){
            sum = sum + x;

            if(mp.containsKey(sum - k)){        // ✅ containsKey
                res = res + mp.get(sum - k);
            }

            mp.put(sum, mp.getOrDefault(sum, 0) + 1); // ✅ save to map
        }
        return res;
    }
}
