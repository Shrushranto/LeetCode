class Solution {
    public int findNumbers(int[] nums) {
        int totalCount = 0;
        for(int i=0;i<nums.length;i++){
            int count = 0;
            int val = nums[i];
            while(val > 0){
                int digit = val%10;
                count++;
                val /= 10;
            }
            if(count % 2 == 0) totalCount++;
        }
        return totalCount;
    }
}