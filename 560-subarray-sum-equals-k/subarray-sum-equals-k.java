class Solution {
    public int subarraySum(int[] nums, int k) {
        int res=0;
        int ps=0;
        Map<Integer,Integer> map=new HashMap();
        //map.put(0,1);
        for(int i=0;i<nums.length;i++){
            ps=ps+nums[i];

           // res=map.getOrDefault(ps-k,0);
           if(ps==k){
            res++;
           }
           if(map.containsKey(ps-k)){
            res=res+map.get(ps-k);
           }

            map.put(ps,map.getOrDefault(ps,0)+1);
        }
        return res;
    }
}