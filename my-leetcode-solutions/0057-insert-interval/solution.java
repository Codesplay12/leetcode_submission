class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        boolean insert = false;

        for(int i = 0;i<intervals.length;i++){
          
            if(!insert && newInterval[0] < intervals[i][0]){
                res.add(newInterval);
                insert = true;
            }
            res.add(intervals[i]);
        }
         // if not inserted till end
        if(!insert) {
            res.add(newInterval);
        }
         int[][] arr = res.toArray(new int[res.size()][]);

        // merge intervals
        return merge(arr);
    }

    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        List<int[]> ans = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i = 1; i < intervals.length; i++) {

            int s = intervals[i][0];
            int e = intervals[i][1];

            if(end >= s) {

                end = Math.max(end, e);
            }
            else {

                ans.add(new int[]{start, end});

                start = s;
                end = e;
            }
        }

        ans.add(new int[]{start, end});

        return ans.toArray(new int[ans.size()][]);
    
    }
}
