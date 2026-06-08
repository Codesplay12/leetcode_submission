class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        int sum  = 0;
        int maxLen = 0;
        mp.put(0,-1);

        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0){
                sum -= 1;
            }
            else{
                sum +=1;
            }

            if(mp.containsKey(sum)){
               
                maxLen = Math.max(i-mp.get(sum),maxLen);
            }
            else{
                mp.put(sum,i);
            }
        }
        return maxLen;
    }
}
