class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        int []m= new int[2*n+2];
        int c=n;
        int max=0;
        for(int i=0;i<n;i++){
            c=c+(nums[i]<<1)-1;
            // int z=0;
            // int o=0;
            // for(int j=i;j<nums.length;j++){

                if(c==n){
                    max=i+1;
                }
                else if(m[c]==0){
                    m[c]=i+1;
                }
                else{
                    max=Math.max(max,i-m[c]+1);
                }
            
        }
        return max;
    }
}