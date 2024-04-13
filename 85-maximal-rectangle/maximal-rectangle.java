class Solution {
    public int maximalRectangle(char[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] h = new int[col + 1];
        int max = 0;

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return 0;

        for (char[] r : matrix) {
            for (int i = 0; i < col; i++) {
                if(r[i]=='1'){
                    h[i]=h[i]+1;
                }
                else{
                    h[i]=0;
                }
               // h[i] = (r[i] == '1') ? h[i] + 1 : 0;
            }
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < h.length; i++) {
                while (!st.isEmpty() && h[i] < h[st.peek()]) {
                    int u = h[st.pop()];
                    int w;
                    if(st.isEmpty()){
                        w=i;
                    }else{
                        w=i-st.peek()-1;
                    }

                    //int w = st.isEmpty() ? i : i - st.peek() - 1;
                    max = Math.max(max, u * w);
                }
                st.push(i);
            }
        }
        return max;
    }
}