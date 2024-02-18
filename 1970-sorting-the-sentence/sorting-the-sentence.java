class Solution {
    public String sortSentence(String s) {
       String [] w= s.split(" ");
       String [] a= new String[w.length];
       for(String h:w ){
           int index=h.charAt(h.length()-1)-'0';
           String str=h.substring(0,h.length()-1);
           a[index-1]=str;
       }
       return String.join(" ",a);
    }
}