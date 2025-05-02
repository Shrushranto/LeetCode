class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left =0;
        int right = 0;
        int minSize = Integer.MAX_VALUE;
        int sum = 0;
        while(right<nums.length){
            sum += nums[right];
            if(sum>= target){
                while(sum>= target){
                    sum -= nums[left];
                    left++;
                }
                minSize = Math.min(minSize, right-left+2);
            }    
            right++;
        }
        return minSize == Integer.MAX_VALUE?0:minSize;
    }
}