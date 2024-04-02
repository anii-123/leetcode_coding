class Solution {
    public boolean isIsomorphic(String s, String t) {
        int [] st = new int [200];
        int [] uv = new int [200];
        int len=s.length();
        if(len != t.length()){
            return false;
        }
        for(int i=0;i<len;i++){
            if(st[s.charAt(i)] != uv[t.charAt(i)]){
                return false;
            }
            st[s.charAt(i)]=i+1;
            uv[t.charAt(i)]=i+1;
        }
        return true;
    }
}