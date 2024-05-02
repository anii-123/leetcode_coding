class Solution {
    public int findMaxK(int[] num) {
         Arrays.sort(num);
        int n = num.length;
        for (int i = n-1; i >= 0; i--) {
            if (num[i] > 0 && Arrays.binarySearch(num ,-num[i]) >= 0) {
                return num[i];
            }
        }
        return -1; 
    }
}