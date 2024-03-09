class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-zA-Z0-9]","");
        
        int j=0;
        int h=s.length()-1;
        while(j<h){
            if(s.charAt(j)!=s.charAt(h)){
                return false;
            }
            j++;
            h--;
        }
        return true;

    }
}