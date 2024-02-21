class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int rightcount=0;
        while(left!=right){
            left=left>>1;
            right=right>>1;
            rightcount++;
        }
        int j=right <<rightcount;
        return j;
    }
}