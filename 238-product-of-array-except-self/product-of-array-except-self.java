class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int []l =new int[nums.length];
        // int []r =new int[nums.length];
        // int [] ans= new int[nums.length];
        // l[0]=1;
        // for(int i=1;i<nums.length;i++){
        //     l[i]=l[i-1]*nums[i-1];
        // }
        // r[nums.length-1]=1;
        // for(int i=nums.length-2;i>=0;i--){
        //     r[i]=r[i+1]*nums[i+1];
        // }
        // for(int i=0;i<nums.length;i++){
        //     ans[i]=l[i]*r[i];
        // }
        // return ans;
        int n=nums.length;
        int prefix[]=new int[n];
        int suffix[]=new int[n];
        int res[]=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n-1;i++){
            prefix[i]=prefix[i-1]*nums[i];
        }
        suffix[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i];
        }
        for(int i=1;i<n-1;i++){
            res[i]=prefix[i-1]*suffix[i+1];
        }
        res[0]=suffix[1];
        res[n-1]=prefix[n-2];

        return res;


    }
}