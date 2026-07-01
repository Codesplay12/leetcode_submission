class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        // Map<Integer,Integer> mp = new HashMap<>();
        //  int n = nums.length;
        // for(int i = 0;i<n;i++){
        //     int j = nums[i];
        //   mp.put(j,mp.getOrDefault(j,0)+1);
        // }
        // for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
        //      for(int i = 0;i<n;i++){
        //         if(entry.getValue()>n/2){
        //             return entry.getKey();
        //         }
               
        //      }
        // }
        // return -1;

        return nums[nums.length/2];
    }
}
