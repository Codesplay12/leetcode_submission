class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int n = nums.length;
        int count = 0;
       for(int i = 0;i<n;i++){
        long sum = 0;
         for(int j =i;j<n;j++){
            sum += nums[j];
            if(sum%10 == x && firstDigit(sum) == x){
                count++;
            }
        }
       }
       return count;

       
    }
     private int firstDigit(long num) {
        while (num >= 10) {
            num /= 10;
        }
        return (int) num;
    }
}
