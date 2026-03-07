class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
         int max_diff = Integer.MAX_VALUE;
            int ressum= 0 ;
        for(int i = 0;i<nums.length-2;i++){
            int j = i+1;
            int k = nums.length-1;
           

            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target){
                    return sum;
                }
                if(sum < target){
                  int diff = Math.abs(sum - target);

                 if(max_diff> diff){
                    max_diff = diff;
                    ressum = sum;
                }
                                    j++;


                }
                 if(sum > target){
                  int diff = Math.abs(sum - target);

                 if(max_diff> diff){
                    max_diff = diff;
                    ressum = sum;
                }
                                    k--;


                }
                
            }
        }
        return ressum;
    }
}
