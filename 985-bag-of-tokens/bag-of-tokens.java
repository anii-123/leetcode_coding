class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int st=0;
        int ed=tokens.length-1;
        int max =0;
        int score=0;
        while(st<=ed){
            if(power>=tokens[st]){
                power=power-tokens[st];
                st++;
                score=score+1;
            }else if(max>0){
                power=power+tokens[ed];
                ed--;
                score=score-1;
            }else {
                break;
            }
            max=Math.max(max,score);
        }
        return max;
    }
}