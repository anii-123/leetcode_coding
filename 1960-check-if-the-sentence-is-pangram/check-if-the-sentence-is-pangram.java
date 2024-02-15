class Solution {
    public boolean checkIfPangram(String s) {
         char ch='a';
        for(int i=0; i < 26; i++)
            if(s.contains(String.valueOf(ch))) 
                ch++;
            else 
                return false;
        return true;
    }
}