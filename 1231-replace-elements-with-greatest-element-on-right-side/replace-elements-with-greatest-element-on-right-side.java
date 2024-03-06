class Solution {
    public int[] replaceElements(int[] arr) {
        //int []k =new int[arr.length];
        //int max=0;
        int n=arr.length;
        int temp=arr[n-1];
        arr[n-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
           if(arr[i]>temp){
               int k=arr[i];
               arr[i]=temp;
               temp=k;
           }
           else{
               arr[i]=temp;
           }
        }
        if(arr.length==1){
            return new int []{-1};
        }
        return arr;
    }
}