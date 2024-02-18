class Solution {
    public int countConsistentStrings(String allowed, String[] w) {
        int count =0;
        for(int i=0;i<w.length;i++){
            String s= w[i];
            boolean flag =true;
            for(int j=0;j<s.length();j++){
                if(!allowed.contains(""+s.charAt(j))){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                ++count;
            }
        }
        return count;
    }
}