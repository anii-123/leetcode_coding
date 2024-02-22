class Solution {
    public int singleNumber(int[] a) {
        HashMap<Integer, Integer> data = new HashMap<>();
        for(int i=0;i<a.length;i++){
            if (data.containsKey(a[i])) {
            //if (data.containskey(a[i])){

                int val=data.get(a[i]);
                val=val+1;
                data.put(a[i],val);
            }
            else{
                data.put(a[i],1);
            }
        }
        for(Integer n:data.keySet()){
            int value = data.get(n);
            if(value==1){
                return n;
            }
        }
        return 0;
    }
}