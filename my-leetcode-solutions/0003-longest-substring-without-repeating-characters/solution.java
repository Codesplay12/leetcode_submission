class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        int i = 0;
        int j = 0;
        int n = s.length();
        Map<Character,Integer> mp = new HashMap<>();
        int mx = Integer.MIN_VALUE;


        while(j<n){
          char ch = s.charAt(j);

          mp.put(ch,mp.getOrDefault(ch,0)+1);

          if(mp.size() == j-i+1) {
            mx = Math.max(mx,j-i+1);
            j++;
          }

          else if(mp.size() < j-i+1){
            while(mp.size()< j-i+1){
             char leftchar = s.charAt(i);
              mp.put(leftchar,mp.get(leftchar)-1);
              if(mp.get(leftchar) == 0){
                mp.remove(leftchar);
              }
               i++;
            }
           j++;
             

          }
          

        }
        return mx;

    }
}
