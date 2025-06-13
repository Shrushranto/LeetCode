class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if(n == 0) return 0;


        int longestSeq = 0;
        int curSeq = 0;
        for(int i=0; i<n-1; i++){
            if(nums[i] == nums[i+1]) continue;

            if(nums[i+1] - nums[i] == 1){
                curSeq++;
                longestSeq = Math.max(longestSeq, curSeq);
            }else{
                curSeq = 0;
            }
        }

        return longestSeq + 1;
    }
}