class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int longest = 0;
        int result = 0;

        for(int i=0; i<nums.length;i++){
            if(i==0 || nums[i-1] >= nums[i]){
                longest =1;
            }else{
                longest +=1;
            }
            result = Math.max(result,longest);
        }
        return result;
        
    }
}