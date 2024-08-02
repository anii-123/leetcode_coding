class Solution {
    public int minSwaps(int[] nums) {
        int k = Arrays.stream(nums).sum();
        int count=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            count=count+nums[i];
        }
        int maxi=count;
        for(int i=k;i<n+k;i++){
            count=count+nums[i%n]-nums[(i-k+n)%n];
            maxi=Math.max(maxi,count);
        }
        return k-maxi;
        
    }
}