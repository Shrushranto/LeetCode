class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] == target){
                return i;
            }
        }
        if(nums[n-1]<target){
            return n;
        }
        for(int j=0; j<n; j++){
            if(nums[j]>target){
                return j;
            }
        }
        return 0;

    }
}