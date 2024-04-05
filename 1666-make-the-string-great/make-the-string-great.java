class Solution {
    public String makeGood(String s) {
        int end = 0;
        char[] charArray = s.toCharArray(); 
        for (int current = 0; current < s.length(); current++) {
            if (end > 0 && Math.abs(charArray[current] - charArray[end- 1]) == 32){
                end--; 
            }else {
                charArray[end] = charArray[current];
                end++;
            }
        }
        return new String(charArray).substring(0, end);
    }
}