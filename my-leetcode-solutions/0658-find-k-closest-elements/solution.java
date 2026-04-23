class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (b[0] == a[0]) {
                return Integer.compare(b[1], a[1]); // tie → larger element first
            }
            return Integer.compare(b[0], a[0]); // max heap
        });

        List<Integer> list = new ArrayList<>();

        for (int num : arr) {
            pq.offer(new int[]{Math.abs(num - x), num});

            if (pq.size() > k) {
                pq.poll();
            }
        }

        while (!pq.isEmpty()) {
            list.add(pq.poll()[1]);
        }

        Collections.sort(list);
        return list;
    }
}
