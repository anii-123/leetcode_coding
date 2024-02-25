class Solution {
    public int searchInsert(int[] n, int target) {
         int l=0;
        int h=n.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if (n[mid]==target){
                return mid;
            }
            else if (n[mid]<target){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return l;
    }
}