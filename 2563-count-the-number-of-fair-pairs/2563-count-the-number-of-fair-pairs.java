class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {

        // O n2 complexity
        // int count = 0;
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         int sum = nums[i] + nums[j];
                
        //     }
        // }
        // return count;

        // performing 2 pointer approach

        Arrays.sort(nums);
        return count(nums, upper+1) - count(nums, lower);
    }

        private long count(int[] nums, int target){
            int l = 0;
            int r = nums.length -1;
            long ans = 0l;
            while(l<r){
                int sum = nums[l] + nums[r];
                if(sum<target){
                    ans += (r-l);
                    l++;
                }else{
                    r--;
                }
            }
            return ans;
        }
}