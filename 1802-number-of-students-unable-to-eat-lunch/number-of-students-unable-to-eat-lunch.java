class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int zcount=0;
        int ocount=0;
        for(int i=0;i<students.length;i++){
            if(students[i]==0){
                zcount++;
            }else{
                ocount++;
            }
        }
        for(int i=0;i<sandwiches.length;i++){
            if(sandwiches[i]==0 && zcount==0){
                return ocount;
            }
            if(sandwiches[i]==1 && ocount==0){
                return zcount;
            }
            if(sandwiches[i]==0){
                zcount--;
            }else{
                ocount--;
            }
        }
        return 0;
    }
}
