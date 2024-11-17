class Solution {
    public int majorityElement(int[] nums) {
        // int m=n[0];
        // int k=1;
        // for(int i=1;i<n.length;i++){
        //     if(k==0){
        //         k++;
        //         m=n[i];
        //     }else if (m==n[i]){
        //         k++;
        //     }else{
        //         k--;
        //     }
          
        // }
        //   return m;


        int n=nums.length;
        int majority=nums[0];
        int lead=1;
        for(int idx=1;idx<n;idx++){
            if(nums[idx]==majority){
                lead++;
            }
            else if(lead>0){
                lead--;
            }
            else{
                majority=nums[idx];
                lead=1;
            }
        }
        return majority;
    }
}