class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        // if(nums[0]!=0)
        //   return 0;
          if(nums[n-1]!=n)
            return n;
        for(int i=0;i<n;i++){
            if(i!=nums[i])
                return i;
            // else{
            //     return i;
            // }
        }
        return 0;
    }
}