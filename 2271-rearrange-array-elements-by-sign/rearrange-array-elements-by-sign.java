class Solution {
    public int[] rearrangeArray(int[] num) {
        int n=num.length;
        int [] h=new int [n];
        int j=0;
        int k=1;
        for(int i=0;i<n;i++){
            if(num[i]>0){
                h[j]=num[i];
                j=j+2;
            }
            else{
                if(num[i]<0){
                    h[k]=num[i];
                    k=k+2;
                }
            }
        }
        return h;
    }
}


        // public int[] shuffle(int[] nums, int n) {
        //    int n=nums.length/2;
        //int[] ans = new int[2*n];
        //int j = n; int k =-1;
        //for(int i = 0;i<n&&j<(2*n);i++,j++){
          //  ans[++k]=(nums[i]);
            //ans[++k]=(nums[j]);
        //}
        //return ans;
   // }
//    int ans[] = new int [n.length];
//    for(int i=0;i<n.length;i++){
//        if(n[i]>0){
//            ans[i]=n[i];
//        }
//        for(int j=n[i+1];j<ans.length;j++){
//            if(j>0){
//            ans[i]=n[j];
//            }
//        }
//    }
//    int j = n; int k =-1;
//         for(int i = 0;i<n&&j<(2*n);i++,j++){
//            ans[++k]=(nums[i]);
//         ans[++k]=(nums[j]);
//         }
//         return ans;
//         return ans;
//     }
// }