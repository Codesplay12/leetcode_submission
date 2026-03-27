class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2){
            return nums.length;
        }

        int insertpos = 2;

        for(int i = 2;i<nums.length;i++){
            if(nums[i] != nums[insertpos-2]){
                nums[insertpos] = nums[i];
                insertpos++;
            }
        }
        return insertpos;
        
    }
}
