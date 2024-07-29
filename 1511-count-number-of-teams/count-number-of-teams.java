class Solution {
    public int numTeams(int[] rate) {
        int n=rate.length;
        int total=0;

        for(int i=0;i<n;i++){
            total=total + counteam(rate,i,n) ;
        }
        return total;
    }
    public int counteam(int [] rate,int i,int total){
        int [] left=countsmall(rate,0,i,rate[i]);
        int [] right=countsmall(rate,i+1,total,rate[i]);
        int ascending=left[0]*right[1];
        int descending=left[1]*right[0];
        return ascending + descending;
    }

    public int[] countsmall(int[] rate, int start,int end,int reference){
        int smaller=0, larger=0;
        for(int i=start;i<end;i++){
            if(rate[i]<reference){
                smaller++;
            }else if(rate[i] >reference){
                larger++;
            }       
        }
        return new int[]{smaller,larger};
    }
}