class Solution {
    public int maxDistance(int[] pos, int m) {
        Arrays.sort(pos);
        int w=1;
        int n=pos[pos.length-1]-pos[0];
        int ans=-1;
        while(w<=n){
            int mid=w+(n-w)/2;
            int last=pos[0];
            int l=1;
            for(int i=0;i<pos.length;i++){
                if(pos[i]-last>=mid){
                    last=pos[i];
                    l++;
                }
            }
            if(l>=m){
                ans=mid;
                w=mid+1;
            }else{
                n=mid-1;
            }
        }
        return ans;
    }
}