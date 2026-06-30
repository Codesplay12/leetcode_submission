class Solution {
    public int numberOfSubstrings(String s) {
        // Map<Character,Integer> mp = new HashMap<>();
        // int i = 0;
        // int count = 0;
       
         int n = s.length();

        // for(int j = 0;j<n;j++){
        //    char ch = s.charAt(j);

        //    mp.put(ch,mp.getOrDefault(ch,0)+1);

        //    while(mp.size() == 3){
        //     count  += n-j;  // to count remaining substrings
        //      char left = s.charAt(i);
        //      mp.put(left,mp.get(left)-1);
        //      if(mp.get(left) == 0){
        //         mp.remove(left);
        //      }
        //      i++;
        //    }
        //    }
        
        // return count;
        int i = 0;

        int count = 0;
        int freq[] = new int[3];

        for(int j = 0;j<n;j++){
            freq[s.charAt(j) - 'a']++;

            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
                count += n-j;

                char ch = s.charAt(i);
                freq[ch - 'a']--;
                i++;
            }
        }
        return count;

    }
}
