class Solution {
    public String customSortString(String order, String s) {
        // String g=order.split("");
        // String []h=new String[g];

        int []count=new int [26];
        for(int i=0;i<s.length();++i){
            count[s.charAt(i)-'a']++;
        }
        StringBuilder res=new StringBuilder();
        for(int i=0 ;i<order.length();++i){
            char c= order.charAt(i);
            while(count[c-'a']>0){
                res.append(c);
                count[c-'a']--;
            }
        }
        for(int i=0;i<26;++i){
            while(count[i]>0){
                res.append((char)('a'+i));
                count[i]--;
            }
        }
        return res.toString();
    }
}