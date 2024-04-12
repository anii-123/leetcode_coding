class Solution {
    public int trap(int[] height) {
        int i=0;
        int lmax=height[0];
        int sum=0;
        int j=height.length-1;
        int rmax=height[j];
        while (i<j)
        {
            if(lmax <= rmax)
            {
                sum=sum + (lmax-height[i]);
                i++;
                lmax=Math.max(lmax,height[i]);
            }
            else 
            {
                sum=sum + (rmax-height[j]);
                j--;
                rmax=Math.max(rmax,height[j]);
            }
        }
        return sum;
    }
}