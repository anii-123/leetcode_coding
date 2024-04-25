class Solution {
    public int longestIdealString(String s, int k) {
        int [] l = new int[27];
        int n = s.length();
        
        for(int i = n-1; i >= 0 ;i--){
            char c = s.charAt(i);
            int index = c - 'a';
            int max  = Integer.MIN_VALUE;
            
            int left = Math.max((index-k), 0);
            int right = Math.min((index + k), 26);
            
            for(int j = left; j <= right ; j++){
                max = Math.max(max, l[j]);
            }
            
            l[index] = max+1;
        }
        
        int max = Integer.MIN_VALUE;
        
        for(int ele : l){
            max = Math.max(ele, max);
        }
        
        return max;
    }
}