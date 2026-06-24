class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> mp = new HashMap<>();
        int i = 0;
        int maxWindow = 0;
        int maxFreq = 0;

        for(int j = 0;j<s.length();j++){
            char ch = s.charAt(j);

            mp.put(ch,mp.getOrDefault(ch,0)+1);
            maxFreq = Math.max(maxFreq,mp.get(ch));

            while(j-i+1 -maxFreq > k){
                char leftChar = s.charAt(i);
                mp.put(leftChar,mp.get(leftChar)-1);
                i++;
            }
            maxWindow = Math.max(maxWindow,j-i+1);
        }
        return maxWindow;
    }
}
