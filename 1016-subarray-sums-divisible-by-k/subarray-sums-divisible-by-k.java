class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int []s= new int[k];
        Arrays.fill(s,0);
        int i=0;
        int j=0;
        s[0]=1;
        for(int num : nums){
            i=((i + num % k) + k) % k;
            j=j + s[i];
            s[i]++;
        }
        return j;
    }
}