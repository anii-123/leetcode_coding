class Solution {
    public String[] sortPeople(String[] names, int[] h) {
        for(int i=0;i<names.length;i++){
            for(int j=i+1;j<names.length;j++){
                if(h[i]<h[j]){
                    int temp=h[i];
                    h[i]=h[j];
                    h[j]=temp;
                    String tempi=names[i];
                    names[i]=names[j];
                    names[j]=tempi;
                }
            }
          //return names ;
        }
        return names ;
    }
}