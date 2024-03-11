class Solution {
    public String decodeMessage(String key, String message) {
        char [] l=new char[128];
        l[32] =32;
        char ch='a';
        for(char c: key.toCharArray()){
            char h=l[c];
            if(h==0){
                l[c]=ch++;
            }
        }
        char[] result=new char[message.length()];
        for(int j=0;j<message.length();j++){
            result[j]=l[message.charAt(j)];

        }
        return new String(result);
    }
}
// String s= " ";
        // for(int=0;i<26;i++){
        //     char s1=char('A'+i);
        //     s=s+s1;
        // } 
        // return s;