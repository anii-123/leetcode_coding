class Solution {
    public String reversePrefix(String word, char ch) {
        int f = word.indexOf(ch);
        if (f == -1) {
            return word;
        }
        StringBuilder sb = new StringBuilder(word.substring(0, f + 1)).reverse();
        if (f < word.length()) {
            sb.append(word.substring(f + 1));
        }
        return sb.toString();   
    }
}