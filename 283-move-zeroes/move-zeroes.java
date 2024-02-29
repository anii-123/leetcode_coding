class Solution {
    public void moveZeroes(int[] n) {
        int []d=new int[n.length];
        int count=0;
    //     int h=0;
    //     for(int k: n){
    //         if(k!=0){
    //             d[i++]=k;
    //         }
    //         while(i<n.length)
    //         d[i++]=0;
    //     }
    //     n=d;
    // }
        for(int i=0;i<n.length;i++){

             if(n[i]!=0){
                     n[count]=n[i];
                 count++;
             }
     }
        while(count<n.length){
        n[count]=0;
        count++;
    }
        
    }
}