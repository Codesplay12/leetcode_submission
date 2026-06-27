class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] parts = path.split("/");

        for(String part:parts){
            if(part.equals("") || part.equals(".")) continue;

            else if(part.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(part);
            }
        }
          StringBuilder result = new StringBuilder();
        for(String s : st){
            result.append("/");
            result.append(s);
        }

        return result.length() == 0 ? "/" : result.toString();

    }
}
