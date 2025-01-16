class Solution {
    public int searchInsert(int[] nums, int target) {
        int idx;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        if(nums[nums.length-1]<target){
            return nums.length;
        }
        for(int j=0; j<nums.length; j++){
            if(nums[j]>target){
                return j;
            }
        }
        return 0;

    }
}