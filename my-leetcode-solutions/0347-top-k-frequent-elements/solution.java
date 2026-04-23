class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(
          (a, b) -> a[0] - b[0]   // sort by first value
);

        for(int x: nums){
          if (!mp.containsKey(x)) {
    mp.put(x, 1);
} else {
    mp.put(x, mp.getOrDefault(x, 0) + 1);
}
        }

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            pq.offer(new int[]{entry.getValue(),entry.getKey()});
            if(pq.size() > k){
                pq.poll();
            }
    }
      int []arr = new int[pq.size()];
      int i = 0;
      while(!pq.isEmpty()){
        arr[i++] = pq.poll()[1];
      }
      return arr;

}
    
    }

