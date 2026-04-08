class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int []res = new int[n];
        res[n-1] = -1;
        int maax = Integer.MIN_VALUE;

        for(int i = n-2;i>=0;i--){
            maax = Math.max(arr[i+1],maax);
            res[i] = maax;

        }

        return res;
    }
}
