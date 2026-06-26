class Solution {

    public String minWindow(String s, String t) {

        if(s.length() < t.length())
            return "";

        Map<Character,Integer> mp = new HashMap<>();

        for(char ch : t.toCharArray()){
            mp.put(ch, mp.getOrDefault(ch,0)+1);
        }

        int count = t.length();

        int i = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;

        for(int j = 0; j < s.length(); j++){

            char ch = s.charAt(j);

            if(mp.containsKey(ch)){
                mp.put(ch, mp.get(ch)-1);

                if(mp.get(ch) >= 0){
                    count--;
                }
            }

            while(count == 0){

                if(j - i + 1 < minLen){
                    minLen = j - i + 1;
                    start = i;
                }

                char left = s.charAt(i);

                if(mp.containsKey(left)){

                    mp.put(left, mp.get(left)+1);

                    if(mp.get(left) > 0){
                        count++;
                    }
                }

                i++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start,start+minLen);
    }
}
