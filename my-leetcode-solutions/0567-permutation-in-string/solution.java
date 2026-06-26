class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length())
            return false;

        int[] a = new int[26];
        int[] b = new int[26];

        for(char ch : s1.toCharArray()){
            a[ch - 'a']++;
        }

        int i = 0;

        for(int j = 0; j < s2.length(); j++){

            b[s2.charAt(j) - 'a']++;

            if(j - i + 1 > s1.length()){
                b[s2.charAt(i) - 'a']--;
                i++;
            }

            if(j - i + 1 == s1.length()){

                if(Arrays.equals(a,b)){
                    return true;
                }
            }
        }

        return false;
    }
}
