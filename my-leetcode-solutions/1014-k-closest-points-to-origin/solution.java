class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxH = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for (int i = 0; i < points.length; i++) {
            int dist = points[i][0] * points[i][0] + points[i][1] * points[i][1];

            maxH.offer(new int[]{dist, points[i][0], points[i][1]});

            if (maxH.size() > k) {
                maxH.poll();
            }
        }

        int[][] result = new int[k][2];
        int i = 0;
        while (!maxH.isEmpty()) {
            int[] curr = maxH.poll();
            result[i][0] = curr[1];  // x
            result[i][1] = curr[2];  // y
            i++;
        }

        return result;
    }
}
