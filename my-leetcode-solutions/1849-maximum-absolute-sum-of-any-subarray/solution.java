class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int currSubSum = nums[0];
        int maxSubSum = nums[0];

        int currSubSum1 = nums[0];
        int minSubSum = nums[0];

        for(int i = 1;i<nums.length;i++){
            currSubSum = Math.max(nums[i],nums[i]+ currSubSum);

            maxSubSum = Math.max(currSubSum,maxSubSum);

            currSubSum1 = Math.min(nums[i],nums[i]+ currSubSum1);

            minSubSum = Math.min(currSubSum1,minSubSum);
        }

        return Math.max(maxSubSum,Math.abs(minSubSum));
    }
}
