class Solution {
    public int rearrangeCharacters(String s, String target) {
        Map<Character,Integer> mp = new HashMap<>();
        Map<Character,Integer> mp1 = new HashMap<>();

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
         for(int i = 0;i<target.length();i++){
            char ch1 = target.charAt(i);
            mp1.put(ch1,mp1.getOrDefault(ch1,0)+1);
        }
          int maxWords = Integer.MAX_VALUE;
        for(Map.Entry<Character,Integer> entry : mp1.entrySet()){
            char ch = entry.getKey();
            int required = entry.getValue();
            int available = mp.getOrDefault(ch,0);

            maxWords = Math.min(maxWords,available/required);

        }
        return maxWords;
    }
}
