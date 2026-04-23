class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0;i<stones.length;i++){
            maxHeap.add(stones[i]);
        }
          while(maxHeap.size()>1){
          int x = maxHeap.poll();
        int y = maxHeap.poll();

        if(x> y){
            int val = x-y;
            maxHeap.add(val);
        }

        if(y>x){
            int val = y-x;
            maxHeap.add(val);
        }
        if(x == y){
            continue;
        }

          }
           if(maxHeap.isEmpty()) return 0;
          return maxHeap.peek();
        
    }
}

