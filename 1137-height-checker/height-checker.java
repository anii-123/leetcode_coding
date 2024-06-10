class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int []a =Arrays.copyOf(heights, heights.length);
        Arrays.sort(a);
        int count=0;
        for(int i=0;i<n;i++){
            if(heights[i] != a[i]){
                count++;
            }
        }
        return count;
    }
}