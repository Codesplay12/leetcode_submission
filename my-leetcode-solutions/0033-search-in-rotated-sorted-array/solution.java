class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = (low + high)/2;

            if(nums[mid] == target) return mid;

            if(nums[mid] > nums[n-1]){ // mid in LEFT half
                if(target > nums[mid]){
                    low = mid + 1;  // ✅ go right
                }
                else if(target < nums[0]){
                    low = mid + 1;  // ✅ target in right half
                }
                else{
                    high = mid - 1; // ✅ target in left half
                }
            }
            else{ // mid in RIGHT half
                if(target < nums[mid]){
                    high = mid - 1; // ✅ go left
                }
                else if(target > nums[n-1]){
                    high = mid - 1; // ✅ target in left half
                }
                else{
                    low = mid + 1;  // ✅ go right
                }
            }
        }
        return -1;
    }
}
