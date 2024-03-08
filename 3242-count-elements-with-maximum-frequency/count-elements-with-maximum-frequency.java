class Solution {
    public int maxFrequencyElements(int[] nums) {
        int count=0;
        int []freq=new int[101];
        int []s=new int[100];
        int f=-1;
        int maxfreq=0;
        for(int n:nums){
            if(freq[n]++==0){
                s[++f]=n;
            }
            if(freq[n]>maxfreq){
                maxfreq=freq[n];
            }
        }
        int i=0;
        while(i<=f){
            if(freq[s[i++]] == maxfreq){
                count++;
            }
        }
        return count*maxfreq;
    }
}