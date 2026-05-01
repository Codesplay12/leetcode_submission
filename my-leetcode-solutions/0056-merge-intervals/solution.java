class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
                    int[] prev = intervals[0];

         List<int[]> m = new ArrayList<>();
       
        for(int i = 1;i<intervals.length;i++){
            if(prev[1]>= intervals[i][0]){
                prev[1] = Math.max(prev[1],intervals[i][1]);
               }
               else{
                 m.add(prev);
                 prev = intervals[i];
               }
        }
        m.add(prev);
        return m.toArray(new int[m.size()][]);
    }
}
