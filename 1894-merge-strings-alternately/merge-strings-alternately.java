class Solution {
    public String mergeAlternately(String w1, String w2) {
       char[]ch=new char[w1.length()+w2.length()];
       int i=0;
       int a=0;
       int b=0;
       while(i<ch.length){
           if(a<w1.length()){
               ch[i++]=w1.charAt(a++);
           }
           if(b<w2.length()){
               ch[i++]=w2.charAt(b++);
           }
       }
       return String.valueOf(ch);
    }
}