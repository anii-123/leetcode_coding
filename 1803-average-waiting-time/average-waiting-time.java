class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n= customers.length;
        double wait=customers[0][1];
        int finish = customers[0][0] +customers[0][1];

        for(int i=1;i<n;i++){
            int[] t = customers[i];
            int a = t[0];
            int s= Math.max(a,finish);
            int e= s + t[1];
            finish = e;
            wait = wait + e - a;
        }
        return wait/n;
        
    }
}