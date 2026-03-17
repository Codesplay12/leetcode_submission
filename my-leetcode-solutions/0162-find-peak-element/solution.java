class Solution {
    public int findPeakElement(int[] nums) {
       int n = nums.length;
       int low = 0;
       int high = n-1;
       int res = -1;
       while(low <= high){
        int mid = (low  + high)/2;
        if(mid < n-1 && nums[mid] < nums[mid+1]){
            low = mid+1;

        }
        else {
            res = mid;
            high = mid-1;
        }
       }
       return res;

    }
}
