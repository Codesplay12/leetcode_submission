class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
              Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>(); // ✅ num → nextGreater

        // find next greater for all nums2 elements
        for(int i = nums2.length-1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= nums2[i]){ // ✅
                st.pop();
            }
            if(st.isEmpty()){
                map.put(nums2[i], -1); // ✅ no greater element
            }
            else{
                map.put(nums2[i], st.peek()); // ✅ next greater
            }
            st.push(nums2[i]); // ✅ push value not index
        }

        // build result for nums1
        int[] res = new int[nums1.length]; // ✅ size of nums1
        for(int i = 0; i < nums1.length; i++){
            res[i] = map.get(nums1[i]); // ✅ lookup in map
        }
        return res;
    }
}
