class Solution {
    public int firstUniqChar(String s) {

        Map<Character,Integer> mp = new HashMap<>();

        // Count frequency
        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        // Find first unique character
        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(mp.get(ch) == 1) {
                return i;
            }
        }

        return -1;
    }
}
