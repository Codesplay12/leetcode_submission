class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
       // int count = 0;
        int n = arr.length;
        Arrays.sort(arr);
        int num = 1;
        arr[0] = 1;
        for(int i = 1;i<n;i++){
          if(arr[i]!= num){
            num++;
          }
        }
        return num;

    }
}
