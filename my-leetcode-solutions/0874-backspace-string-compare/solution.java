class Solution {
    public boolean backspaceCompare(String s, String t) {
       
         StringBuilder sb = new StringBuilder();

        StringBuilder sb1 = new StringBuilder();

      for(int i = 0;i<s.length();i++){
         if(s.charAt(i) == '#'){
            if(sb.length() > 0){
            sb.deleteCharAt(sb.length()-1);
            }
         }
         else{
            sb.append(s.charAt(i));
         }
      }
        for(int j = 0;j<t.length();j++){
         if(t.charAt(j) == '#'){
           if(sb1.length() > 0){
            sb1.deleteCharAt(sb1.length()-1);
            }
         }
          else{
            sb1.append(t.charAt(j));
         }
      }
      return sb.toString().equals(sb1.toString());
    }
}
