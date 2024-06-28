class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int []degree = new int[n];
        for(int[] r :roads){
            degree[r[0]]++;
            degree[r[1]]++;
        }
        int []frequency =new int[n];
        for(int d:degree){
            frequency[d]++;
        }
        long total=0;
        long value =1;
        for(long i=0;i<n;i++){
            for(int j=0;j<frequency[(int)i];j++){
                total = total +i*value++;
            }
        }
        return total;
    }
}