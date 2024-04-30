class Solution {
    public long wonderfulSubstrings(String word) {
        long[] count = new long[1024]; 
        count[0] = 1;
        int k = 0; 
        long ans = 0;
        char[] chars = word.toCharArray();
        for (char c : chars) {
            int index = c - 'a';
            k ^= 1 << index; 
            ans += count[k]; 
            for (int i = 1; i <= 512; i*=2) {
                ans += count[k ^ i];
            }
            count[k]++; 
        }
        return ans;
    }
}