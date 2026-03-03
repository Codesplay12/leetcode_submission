class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0,j= 1,unique = 1;
        while(j<nums.length){
            if(nums[i] == nums[j]) {
                j++;
                
            }

            else if(nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
                j++;
                unique++; //2

            }
        }
        return unique;

    }
}
