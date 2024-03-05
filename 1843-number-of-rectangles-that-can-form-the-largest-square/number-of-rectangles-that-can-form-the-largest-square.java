class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int n=rectangles.length;
        int []p=new int[n];
        for(int i=0;i<n;i++){
            
                if(rectangles[i][0]<rectangles[i][1]){
                     p[i]=rectangles[i][0];
                }
                else{
                     p[i]=rectangles[i][1];
                }
            }
            int max=Largest(p,n,0);
            int count=0;
         for(int i=0;i<n;i++){
            if(max == p[i]){
                count++;
            }
        }
        return count;
    }
    public static int Largest(int [] p, int n, int i){
        if(i==n-1){
            return p[i];
        }
        int large=Largest(p,n,i+1);
        return Math.max(large,p[i]);
    }
}
