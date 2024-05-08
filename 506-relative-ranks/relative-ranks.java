class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int max = 0;
        for (int x : score) {
            if (x > max) {
                max = x;
            }
        }
        int s[] = new int[max + 1];
        for (int i = 0; i < n; i++) {
            s[score[i]] = i + 1;
        }

        String r[] = new String[n];
        int c = 1;
        String medals[] = { "Gold Medal", "Silver Medal", "Bronze Medal" };

        for (int i = max; i >= 0; i--) {
            if (s[i] != 0) {
                int org_idx = s[i] - 1;
                if (c < 4) {
                    r[org_idx] = medals[c - 1];
                } else {
                    r[org_idx] = Integer.toString(c);
                }
                c++;
            }
        }
        return r;
    }
}