class Solution {
    public int strStr(String s1, String s2) {
        if(!s1.contains(s2)){
            return -1;
        }

        int m= s1.length();
        int n = s2.length();

        char[] ch = s1.toCharArray();
        char[] ch1 = s2.toCharArray();


        for(int i = 0;i<=m-n;i++){
            for(int j = 0;j<n;j++){
                if(ch[i+j] != ch1[j])
                    break;
                
                if(j == n-1){
                    return i;
                }
            }
        }
        return -1;



    }
}