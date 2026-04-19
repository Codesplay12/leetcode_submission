class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> mapST = new HashMap<>(); // s→t
        Map<Character,Character> mapTS = new HashMap<>(); // t→s

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            // check s→t mapping
            if(mapST.containsKey(sc)){
                if(mapST.get(sc) != tc) return false; // ✅
            }
            else{
                mapST.put(sc, tc); // ✅
            }

            // check t→s mapping
            if(mapTS.containsKey(tc)){
                if(mapTS.get(tc) != sc) return false; // ✅
            }
            else{
                mapTS.put(tc, sc); // ✅
            }
        }
        return true;
    }
}
