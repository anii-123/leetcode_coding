class Solution {
    public void moveZeroes(int[] nums) {
        int[] res = new int[nums.length];
    	int resPointer = 0;
    	for(int val : nums)
    		if(val != 0) 
    			res[resPointer++] = val;
    	for(var i=0;i<nums.length;i++)
        nums[i] = res[i];	
    	return;
    //     int []d=new int[n.length];
    //     int count=0;
    //     for(int i=0;i<n.length;i++){

    //          if(n[i]!=0){
    //                  n[count]=n[i];
    //              count++;
    //          }
    //  }
    //     while(count<n.length){
    //     n[count]=0;
    //     count++;
    // }
        
    }
}