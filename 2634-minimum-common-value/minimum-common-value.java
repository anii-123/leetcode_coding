class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int k=nums1.length;
        int h=nums2.length;
        int p1=0;
        int p2=0;
        while(p1<k && p2<h){
            if(nums1[p1] < nums2[p2]){
                p1++;
            }
            else if(nums1[p1]> nums2[p2]){
                p2++;
            }else{
                return nums1[p1];
            }
        }
        return -1;




        // int []l=new int[nums1.length];
        // for(int i=0,j=0;i<nums1.length && j<nums2.length;i++,j++){
        //     if(nums1[i]==nums2[j]){
        //         int [i]l=nums1[i];
        //     }
            
        // }

        // int k=Math.min(max,l);
        // return k;
    }
}