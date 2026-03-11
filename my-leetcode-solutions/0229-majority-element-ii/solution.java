class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int k = n/3;
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num,map.getOrDefault(num,0) + 1);
            }
            else{
                map.put(num,1);
            }
        }
         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
           if(entry.getValue() > k){
             list.add(entry.getKey());
           }
        }

        return list;

    }
}
