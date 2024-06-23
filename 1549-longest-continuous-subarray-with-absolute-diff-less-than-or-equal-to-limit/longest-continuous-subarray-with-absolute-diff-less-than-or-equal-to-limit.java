class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> max = new ArrayDeque<>();
        Deque<Integer> min = new ArrayDeque<>();
        int n = nums.length;
        int j = 0;
        int ans = 0;
        for(int i = 0; i < n; i ++){
            while(!max.isEmpty() && nums[i] > max.peekLast()){
                max.pollLast();
            }
            max.addLast(nums[i]);

            while(!min.isEmpty() && nums[i] < min.peekLast()){
                min.pollLast();
            }
            min.addLast(nums[i]);

            if(max.peekFirst() - min.peekFirst() > limit){
                if(nums[j] == max.peekFirst()) max.pollFirst();
                if(nums[j] == min.peekFirst()) min.pollFirst();
                j++;
            }
            ans = Math.max(ans, i - j + 1);
        }
        return ans;
    }
}