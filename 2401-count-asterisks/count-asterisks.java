class Solution {
    public int countAsterisks(String s) {
        int count=0;
        int d=0;
        char [] g=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(g[i]=='|'){
                d++;
            }
            if(d%2==0){
            if(g[i]=='*'){
                count++;
            }
            }
        }
        return count;
    }
}