class Solution {
    public int passThePillow(int n, int time) {
        int com= time / (n-1);
        int remain = time % (n-1);
        int ans = 0;
        if (com % 2 != 0) {
            ans = n - remain;
        } else {
            ans = remain+ 1;
        }
        return ans;
    }
}