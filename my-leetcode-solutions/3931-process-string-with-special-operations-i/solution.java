class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        char ch = 'a'; // Tracks the last seen lowercase alphabet character

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i); // Read character once for better efficiency
           
            if (current >= 'a' && current <= 'z') {
               
                sb.append(current);
            }
            else if (current == '*') {
                // BUG FIX: Check the length of sb, not s
                if (sb.length() > 0) { 
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
            else if (current == '%') {
                sb.reverse();
            }
            else if (current == '#') {
              if(sb.length() > 0){
            if(sb.length() > 0){
    sb.append(sb.toString());
}
              }
            }
        }
        return sb.toString();
    }
}

