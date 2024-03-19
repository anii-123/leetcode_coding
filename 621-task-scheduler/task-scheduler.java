class Solution {
    public int leastInterval(char[] tasks, int n) {
        int [] taskfreq =new int[26];
        for(char c: tasks){
            taskfreq[c-'A']++;
        }
        Arrays.sort(taskfreq);
        int batchcount= taskfreq[25];
        int vacant =--batchcount*n;
        for(int index =0;index<25;index++){
            vacant =vacant-Math.min(taskfreq[index],batchcount);
        }
        if(vacant >0){
            return tasks.length+vacant;
        }else{
            return tasks.length;
        }
        //return vacant>0 ? tasks.length+vacant: tasks.length;
       // return 0;
    }
}