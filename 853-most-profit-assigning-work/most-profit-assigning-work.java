class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int max = 0;
        for (int d : difficulty) {
            max = Math.max(max, d);
        }
        int[] maxProfit = new int[max + 1];
        for (int i = 0; i < difficulty.length; i++) {
            maxProfit[difficulty[i]] = Math.max(maxProfit[difficulty[i]], profit[i]);
        }
        for (int i = 1; i <= max; i++) {
            maxProfit[i] = Math.max(maxProfit[i], maxProfit[i - 1]);
        }
        int totalProfit = 0;
        for (int ability : worker) {
            if (ability > max) {
                totalProfit += maxProfit[max];
            } else {
                totalProfit += maxProfit[ability];
            }
        }
        return totalProfit;
    }

}