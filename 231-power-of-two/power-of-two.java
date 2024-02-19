class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i=0;i<31;i++){
            int res= (int) Math.pow(2,i);
            if(res==n)
            return true;
        }
        return false;
        
    }
}