class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int arr[] = new int[n+1];
        arr[0] = 0;

        for(int i = 0;i<gain.length;i++){
            arr[i+1] = arr[i] + gain[i];
        }

        int max = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
