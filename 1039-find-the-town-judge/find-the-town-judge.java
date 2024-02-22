class Solution {
    public int findJudge(int n, int[][] trust) {
        int [] a= new int [n+1];
        int [] b= new int [n+1];
        for(int []c : trust){
            b[c[0]]++;
            a[c[1]]++;
        }
        for(int i=1;i<=n ; ++i){
            if(a[i]==n-1 && b[i]==0)
            return i;
        }
        // int m= trust.length;
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<m;j++){
        //         if(trust[i]!=trust[j]){
        //             return j;
        //         }
        //     }
        // }
        return -1;
    }
}