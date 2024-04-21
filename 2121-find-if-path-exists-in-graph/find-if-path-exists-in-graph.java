class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(edges.length == 0) 
        return true;
        boolean[] k = new boolean[n];
        boolean flag = true;
        k[source] = true;
        while(flag){
           flag = false;
               for(int[] edge : edges){
                    if(k[edge[0]] != k[edge[1]]){
                       k[edge[0]] = true;
                       k[edge[1]] = true;
                       flag = true;
                    }
                    if(k[destination]){
                       return true;
                    }
                }
        }
    return false;
    }
}