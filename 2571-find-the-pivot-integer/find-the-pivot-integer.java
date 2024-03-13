class Solution {
    public int pivotInteger(int n) {
        int lv=1;
        int rv=n;
        int sl=lv;
        int sr=rv;
        if(n==1){
            return n;
        }
        while(lv<rv){
            if(sl<sr){
                sl += ++lv;
            }
            else{
                sr +=--rv;
            }
            if(sl==sr && lv+1 ==rv-1){
                 return lv+1;
            } 
        }
        return -1;
    }
}