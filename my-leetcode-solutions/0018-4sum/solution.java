class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>(); // ✅ added

        for(int i = 0; i < n-3; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue; // ✅ moved outside while

            for(int j = i+1; j < n-2; j++){
                if(j > i+1 && nums[j] == nums[j-1]) continue; // ✅ moved outside while

                int left  = j+1;
                int right = n-1;

                while(left < right){
                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right]; // ✅ long to avoid overflow

                    if(sum == target){
                        result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right])); // ✅
                        left++;
                        right--;

                        // skip duplicates ✅
                        while(left < right && nums[left]  == nums[left-1])  left++;
                        while(left < right && nums[right] == nums[right+1]) right--;

                    } else if(sum < target){
                        left++;  // ✅ need bigger sum
                    } else {
                        right--; // ✅ need smaller sum
                    }
                }
            }
        }
        return result; // ✅
    }
}

