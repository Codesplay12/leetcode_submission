class Solution {
    public boolean isPalindrome(String s) {
        // StringBuilder sb = new StringBuilder();
        // sb.reverse(s);
        // if(sb.equals(s)) {
        //     return true;
        // }

        // return false;
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase(); 
        int i = 0;
        int j = s.length()-1;
        
        while(i<j){
           if(s.charAt(i) != s.charAt(j)) return false;
            i++;
        j--;
        }
       
        
        return true;
    }
}

