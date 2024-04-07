class Solution {
    public boolean checkValidString(String s) {
        int low = 0;
        int high = 0;
        for (char c : s.toCharArray()) {
            if(c=='('){
                low=low+1;
            }else{
                low=low+ (-1);
            }
            //low += (c == '(') ? 1 : -1;
            high += (c != ')') ? 1 : -1;
            if (high < 0)
             return false;
            low = Math.max(low, 0);
        }
        return low == 0;
    }
}